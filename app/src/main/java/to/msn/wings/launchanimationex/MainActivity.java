package to.msn.wings.launchanimationex;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private final static int MP= ViewGroup.LayoutParams.MATCH_PARENT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        //レイアウトの生成
        LinearLayout layout=new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        setContentView(layout);

        //イメージビューの生成
        ImageView imageView=new ImageView(this);
        imageView.setImageBitmap(res2bmp(this,R.drawable.sample));
        imageView.setLayoutParams(new LinearLayout.LayoutParams(MP,MP));
        layout.addView(imageView);
    }

    //リソース→ビットマップ
    //ライザップ→リバウンド
    public static Bitmap res2bmp(Context context,int resID){
        return BitmapFactory.decodeResource(
                context.getResources(),resID);
    }
}
