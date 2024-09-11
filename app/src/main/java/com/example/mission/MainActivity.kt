import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mission.TaskDatabase
import com.example.mission.TaskViewModel
import com.example.mission.TaskViewModelFactory
import com.example.mission.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var taskDatabase: TaskDatabase

    private lateinit var taskViewModel: TaskViewModel
    private lateinit var adapter: TaskAdapter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Binding setup
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // RecyclerView setup
        adapter = TaskAdapter()
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)

        // Veritabanı ve ViewModel setup
        taskDatabase = TaskDatabase.getDatabase(application) // Use application context

        val viewModelFactory = TaskViewModelFactory(application, taskDatabase)
        taskViewModel = ViewModelProvider(this, viewModelFactory).get(TaskViewModel::class.java)

        // Veriyi gözlemleme
        taskViewModel.allTasks.observe(this) { tasks ->
            tasks?.let { adapter.setTasks(it) }
        }
    }
}
