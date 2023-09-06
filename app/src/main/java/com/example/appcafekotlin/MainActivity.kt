import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.appcafekotlin.R
import com.example.appcafekotlin.adapter.FoodAdapter
import com.example.appcafekotlin.databinding.ActivityMainBinding
import com.example.appcafekotlin.model.Food

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var foodAdapter: FoodAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val foodList = mutableListOf(
            Food("Cafe Coado", "R$ 4,00", R.drawable.cafecoado),
            Food("Capuccino", "R$ 8,00", R.drawable.capuccino),
            Food("Croissant", "R$ 9,00", R.drawable.croissant),
            Food("Espresso", "R$ 6,00", R.drawable.espresso),
            Food("Pão de Queijo", "R$ 5,00", R.drawable.paodequeijo),
            // Adicione mais alimentos conforme necessário
        )

        foodAdapter = FoodAdapter(this, foodList)

        val recyclerViewFood = binding.recyclerView
        recyclerViewFood.adapter = foodAdapter
    }
}

