package kozuma.shun.techacademy.aisatsuapp

import android.app.TimePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        showTimePickerDialog()
    }

    private fun showTimePickerDialog(){
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener{ view, hour, minute ->
                if(hour>=2 && hour<=9){
                    text1.text = "おはよう"
                }else if(hour>=10 && hour<=17){
                    text1.text = "こんにちは"
                }else{
                    text1.text = "こんばんは"
                }
            },
            0,0,true)
        timePickerDialog.show()
    }
}
