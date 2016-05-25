package software.ram.com.butterknifedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity
{

    @BindView( R.id.welcome_textview )
    TextView mWelcomeTextView;

    @BindView( R.id.Welcome_subText )
    TextView mWelcomeSubtextView;

    @BindView( R.id.simple_button )
    Button mSimpleButton;

    @BindString( R.string.welcome_text )
    String mWelcomeTextViewText;

    @BindString( R.string.welcome_subtext )
    String mWelcomeSubTextviewText;

    @BindString( R.string.button_text )
    String mButtonText;


    @OnClick( R.id.simple_button )
    public void summit()
    {
        Toast.makeText( this, "Just ButterKnife Click Demo", Toast.LENGTH_LONG ).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        mSimpleButton.setText( mButtonText );
        mWelcomeTextView.setText( mWelcomeTextViewText );
        mWelcomeSubtextView.setText( mWelcomeSubTextviewText );

    }

}
