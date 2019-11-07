package app.sano.picchi.soccer

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_preview.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //画面遷移
        val intent: Intent = Intent(this,PreviewActivity::class.java)

        //音楽
        val mediaPlayer = MediaPlayer.create(this,R.raw.musp)
        val mediaPlayer2 = MediaPlayer.create(this,R.raw.muja_2)
        val mediaPlayer3 = MediaPlayer.create(this,R.raw.muar_1)
        val mediaPlayer4 = MediaPlayer.create(this,R.raw.mubr_2)
        val mediaPlayer5 = MediaPlayer.create(this,R.raw.muou2)
        val mediaPlayer6 = MediaPlayer.create(this,R.raw.mupo)




        imageViewJ.setOnClickListener {
            intent.putExtra("image",R.drawable.playerjapan)
            startActivity(intent)
            mediaPlayer2.start()



        }

        imageViewAr.setOnClickListener {
            intent.putExtra("image",R.drawable.playerar)
            startActivity(intent)
            mediaPlayer3.start()
        }

        imageViewAu.setOnClickListener {
            intent.putExtra("image", R.drawable.playerau)
            startActivity(intent)
            mediaPlayer5.start()
        }

        imageViewBr.setOnClickListener {
            intent.putExtra("image", R.drawable.playerbr)
            startActivity(intent)
            mediaPlayer4.start()
        }

        imageViewPo.setOnClickListener {
            intent.putExtra("image",R.drawable.playerpr)
            startActivity(intent)
            mediaPlayer6.start()
        }

        imageViewSp.setOnClickListener {
            intent.putExtra("image",R.drawable.playersp)
            startActivity(intent)
            mediaPlayer.start()
        }


    }
}
