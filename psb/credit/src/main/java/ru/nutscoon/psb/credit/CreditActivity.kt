package ru.nutscoon.psb.credit

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CreditActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_credit)

        val offerId = intent.getIntExtra("show_offer", -1)
        if (offerId != -1) {
            showIntent(offerId)
        }

        val recyclerView: RecyclerView = findViewById(R.id.rv_credits)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CustomRecyclerAdapter(fillList())
    }

    private fun fillList(): List<CreditData> {
        return mutableListOf<CreditData>(
            CreditData("Потребительский", "На любые цели, до 300 тыс"),
            CreditData("Рефинансирование", "Низкие ставки, под залог недвижимости"),
            CreditData("Быстрый", "Без залога, без поручителей, до 100 тыс., наличными или на карту"),
            CreditData("Особые условия", "Оставьте заявку и наш менеджер подберёт кредит специально для вас"),
        )
    }

    private fun showIntent(id: Int) {
        val creditOffer = findViewById<TextView>(R.id.credit_offer)
        creditOffer.text = "Специально для вас выгодный кредит № $id. " +
                "Чтобы получить в один клик, нажмите на кнопку, которую ещё не создали"
        creditOffer.visibility = View.VISIBLE
    }
}