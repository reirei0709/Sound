package app.itakura.reirei.sound

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drumsound = MediaPlayer.create(this,R.raw.drum_sound)
        val cymbalsound = MediaPlayer.create(this,R.raw.symbal)
        val guitarsound = MediaPlayer.create(this,R.raw.guitar_sound)

        drumImage.setOnTouchListener{ view,event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                drumsound.seekTo(0)
                drumsound.start()

                drumImage.setImageResource(R.drawable.drum_playing_image)

            }

            else if(event.action == MotionEvent.ACTION_UP){
                drumImage.setImageResource(R.drawable.drum_image)
            }

            true

        }

        guitarImage.setOnTouchListener{ view,event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                guitarsound.seekTo(0)
                guitarsound.start()

                guitarImage.setImageResource(R.drawable.guitar_playing_image)

            }

            else if(event.action == MotionEvent.ACTION_UP){
                guitarImage.setImageResource(R.drawable.guitar_image)
            }

            true

        }



        cymbalImage.setOnTouchListener{ view,event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                cymbalsound.seekTo(0)
                cymbalsound.start()

                cymbalImage.setImageResource(R.drawable.cymbal_playing_image)

            }

            else if(event.action == MotionEvent.ACTION_UP){
                cymbalImage.setImageResource(R.drawable.cymbal_image)
            }

            true

        }




    }
}