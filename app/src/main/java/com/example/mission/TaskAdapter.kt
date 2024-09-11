import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mission.Task
import com.example.mission.databinding.TaskItemBinding

class TaskAdapter : RecyclerView.Adapter<TaskAdapter.TaskViewHolder>() {
    private var tasks = emptyList<Task>()  // Görev listesini tutar

    class TaskViewHolder(val binding: TaskItemBinding) : RecyclerView.ViewHolder(binding.root) {
        // ViewBinding ile doğrudan TaskItemBinding kullanılır
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val binding = TaskItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TaskViewHolder(binding)  // ViewBinding ile ViewHolder oluşturuluyor
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        val currentTask = tasks[position]  // Mevcut görevi alır
        holder.binding.taskTitle.text = currentTask.title  // Görev başlığını bağlar
        holder.binding.taskDescription.text = currentTask.description  // Görev açıklamasını bağlar
    }

    override fun getItemCount() = tasks.size  // Görev sayısını döner

    fun setTasks(tasks: List<Task>) {
        this.tasks = tasks
        notifyDataSetChanged()  // Listeyi günceller
    }
}
