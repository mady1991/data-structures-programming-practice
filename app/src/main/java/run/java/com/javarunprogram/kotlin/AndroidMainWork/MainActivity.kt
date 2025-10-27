//package run.java.com.javarunprogram.kotlin.AndroidMainWork
//
//import android.app.Activity
//import android.content.Intent
//import android.net.Uri
//import android.os.Bundle
//import android.os.Handler
//import android.text.Editable
//import android.text.TextWatcher
//import android.view.Gravity
//import android.view.View
//import android.widget.Button
//import android.widget.LinearLayout
//import android.widget.Toast
//import kotlinx.android.synthetic.main.main.*
//import run.java.com.javarunprogram.R
//
//
//class MainActivity : Activity(), View.OnClickListener {
//    override fun onClick(v: View?) {
//        when (v) {
//            Button1 -> {
//                intent = Intent(this, SecondAcivity::class.java)
//                intent.putExtra("AB", "This is Disco")
//                startActivity(intent)
//                finish()
//            }
//
//            Button2 -> {
//                intent = Intent(Intent.ACTION_VIEW)
//                intent.setData(Uri.parse("https://www.javatpoint.com/"))
//                startActivity(intent)
//            }
//        }
//    }
//
//    fun myClick(v: View) {
//        val layout = layoutInflater.inflate(R.layout.tost, null)
//        val toast = Toast(baseContext)
//        toast.duration = Toast.LENGTH_LONG
//        toast.setGravity(Gravity.CENTER, 0, 0)
//        toast.view = layout
//        toast.show()
//    }
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.main)
//        textView1.setText("This is first TextView")
//        textView2.setText("This is second TextView")
//        Button1.setOnClickListener(this)
//        Button2.setOnClickListener(this)
//
//        setBuutonThreeView(Button3)
//        textView1.setTextColor(resources.getColor(R.color.colorPrimary))
//        editText.addTextChangedListener(object : TextWatcher {
//            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
//            }
//
//            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
//                Handler().postDelayed(object : Runnable {
//                    override fun run() {
//                        textView2.setText(editText.text)
//                    }
//                }, 1000)
//
//            }
//
//
//            override fun afterTextChanged(s: Editable?) {
//
//                textView1.setText(s)
//            }
//
//        })
//
//    }
//
//    private fun setBuutonThreeView(button3: Button) {
//        val parms = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT)
//        button3.setLayoutParams(parms)
//    }
//}
