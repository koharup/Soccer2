package app.sano.picchi.soccer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_preview.*
import android.content.Intent



class PreviewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preview)

        val imageId: Int = intent.getIntExtra("image",0)
        previewImgae.setImageResource(imageId)
        //val intent = this.intent
        val text = intent.getStringExtra("sendText")
        myText.setText(text);














        backButton.setOnClickListener{
            finish()
        }

    }
}
