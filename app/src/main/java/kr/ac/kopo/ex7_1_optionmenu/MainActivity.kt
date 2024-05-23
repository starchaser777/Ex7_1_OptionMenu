package kr.ac.kopo.ex7_1_optionmenu

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    lateinit var linear : LinearLayout
    lateinit var editDegree: EditText
    lateinit var imgV: ImageView
//    lateinit var btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        linear = findViewById<LinearLayout>(R.id.linear)
        editDegree = findViewById<EditText>(R.id.editDegree)
        imgV = findViewById<ImageView>(R.id.imgV)
//        btn = findViewById<Button>(R.id.btn)
    }

    // 옵션메뉴 등록 - * 시험에 출제될 예정 *
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)

        menuInflater.inflate(R.menu.optionmenu, menu)

        return true
    }

    // 항목이 선택되었을 때 이벤트 처리할 수 있는 메소드
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId) {
//            R.id.itemRed -> {
//                linear.setBackgroundColor(Color.RED)
//                return true
//            }
//            R.id.itemGreen -> {
//                linear.setBackgroundColor(Color.GREEN)
//                return true
//            }
//            R.id.itemBlue -> {
//                linear.setBackgroundColor(Color.BLUE)
//                return true
//            }

            R.id.itemRotate -> {
                imgV.rotation += editDegree.text.toString().toFloat()
                return true
            }

            R.id.itemHalla -> {
                imgV.setImageResource(R.drawable.hallasan)
                item.setChecked(true)
                return true
            }

            R.id.itemChuja -> {
                imgV.setImageResource(R.drawable.chujado)
                item.setChecked(true)
                return true
            }

            R.id.itemBeom -> {
                imgV.setImageResource(R.drawable.beomseom)
                item.setChecked(true)
                return true
            }

//            R.id.btnZoomin -> {
//                imgV.scaleX += 2f
//                return true
//            }
        }

        return false
    }
}