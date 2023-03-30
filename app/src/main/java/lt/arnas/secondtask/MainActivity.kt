package lt.arnas.secondtask

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text


class MainActivity : AppCompatActivity() {

    val TAG = "my_tag"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val okButton: Button = findViewById(R.id.okButton)
        okButton.visibility = View.VISIBLE

        okButton.setOnClickListener {
            val nameEditText: TextView = findViewById(R.id.nameEditText)
            val nameLength: Int = nameEditText.length()
            Log.i(TAG, "Name length: $nameLength")
            val numberOfLettersTextView: TextView = findViewById(R.id.numberOfLettersTextView)
            numberOfLettersTextView.text = "The name contains $nameLength symbols"

            val fuelPriceEditText: TextView = findViewById(R.id.fuelPriceEditText)
            val fuelPrice: Float = fuelPriceEditText.text.toString().toFloat()
            val fuelPriceChange: TextView = findViewById(R.id.fuelPriceTextView)
            fuelPriceChange.text = "Fuel price is $fuelPrice Eur"

            val sumTextView: TextView = findViewById(R.id.sumTextView)
            val sum: Float = fuelPrice + nameLength
            sumTextView.text = "Sum of symbols and fuel price is $sum"

            val isSumPositiveTextView: TextView = findViewById(R.id.isSumPositiveTextView)
            val isPositive: Boolean = sum > 0
            isSumPositiveTextView.text = "Is sum positive? $isPositive"

            val firstLetterTextView: TextView = findViewById(R.id.firstLetterTextView)
            val firstLetter = nameEditText.text[0]
            firstLetterTextView.text = "First letter of the name is '$firstLetter'"

            val subtract: Float = nameLength - fuelPrice
            val subtractTextView: TextView = findViewById(R.id.subtractTextView)
            subtractTextView.text = "Result of subtraction $subtract"

        }
    }
}