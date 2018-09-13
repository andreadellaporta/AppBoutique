package andreadellaporta.it.laboutiquedellafrutta;


import android.app.Application;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;


public class BoutiqueApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/OpenSans-Regular.ttf")
                .setFontAttrId(uk.co.chrisjenx.calligraphy.R.attr.fontPath)
                .build()
        );
    }
}