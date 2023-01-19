package hr.algebra.krizickruzic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity( ) {

    private var polja : MutableList< ImageView > = mutableListOf( )
    private var popunjeno : MutableSet< ImageView > = mutableSetOf( )

    override fun onCreate( savedInstanceState: Bundle? ) {
        super.onCreate( savedInstanceState )
        setContentView( R.layout.activity_main )
        polja.add( polje00 )
        polja.add( polje01 )
        polja.add( polje02 )
        polja.add( polje10 )
        polja.add( polje11 )
        polja.add( polje12 )
        polja.add( polje20 )
        polja.add( polje21 )
        polja.add( polje22 )

        polja.forEach{
            it.setOnClickListener {
                ( it as ImageView ).setImageResource( R.drawable.krizic )
                popunjeno.add( it )
                for( x in polja )
                    if( !popunjeno.contains( x ) ) {
                        ( x as ImageView ).setImageResource( R.drawable.kruzic )
                        popunjeno.add( x )
                        break
                    }
            }
        }
    }
}