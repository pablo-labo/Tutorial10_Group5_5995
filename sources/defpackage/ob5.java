package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import com.facebook.react.bridge.ReactContext;
import com.horcrux.svg.FilterRegion;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public class ob5 extends gs3 {
    public String a;
    public final FilterRegion b;

    public ob5(ReactContext reactContext) {
        super(reactContext);
        this.b = new FilterRegion();
    }

    public static Bitmap h(HashMap<String, Bitmap> map, Bitmap bitmap, String str) {
        Bitmap bitmap2 = str != null ? map.get(str) : null;
        return bitmap2 != null ? bitmap2 : bitmap;
    }

    public Bitmap g(HashMap<String, Bitmap> map, Bitmap bitmap) {
        return null;
    }

    @Override // com.horcrux.svg.VirtualView
    public final void saveDefinition() {
    }
}
