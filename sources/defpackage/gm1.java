package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.FirebaseInstanceId;
import expo.modules.imagemanipulator.ResizeOptions;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledFuture;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class gm1 implements u20, im1, n37, OnCompleteListener {
    public final /* synthetic */ int a;
    public Object b;

    public gm1(ResizeOptions resizeOptions) {
        this.a = 1;
        resizeOptions.getClass();
        this.b = resizeOptions;
    }

    public static String c(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // defpackage.n37
    public Bitmap a(Bitmap bitmap) {
        int iIntValue;
        int iIntValue2;
        bitmap.getClass();
        double width = ((double) bitmap.getWidth()) / ((double) bitmap.getHeight());
        ResizeOptions resizeOptions = (ResizeOptions) this.b;
        if (resizeOptions.getWidth() != null) {
            iIntValue = resizeOptions.getWidth().intValue();
            iIntValue2 = (int) (((double) resizeOptions.getWidth().intValue()) / width);
        } else {
            iIntValue = 0;
            iIntValue2 = 0;
        }
        if (resizeOptions.getHeight() != null) {
            iIntValue2 = resizeOptions.getHeight().intValue();
            if (iIntValue == 0) {
                iIntValue = (int) (((double) resizeOptions.getHeight().intValue()) * width);
            }
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, iIntValue, iIntValue2, true);
        bitmapCreateScaledBitmap.getClass();
        return bitmapCreateScaledBitmap;
    }

    @Override // defpackage.u20
    public void b(String str, Bundle bundle) {
        hm1 hm1Var = (hm1) this.b;
        if (hm1Var != null) {
            try {
                hm1Var.a("$A$:" + c(str, bundle));
            } catch (JSONException unused) {
                Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", null);
            }
        }
    }

    @Override // defpackage.im1
    public void d(hm1 hm1Var) {
        this.b = hm1Var;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Registered Firebase Analytics event receiver for breadcrumbs", null);
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.a) {
            case 2:
                ((ScheduledFuture) this.b).cancel(false);
                break;
            default:
                CountDownLatch countDownLatch = (CountDownLatch) this.b;
                ikh ikhVar = FirebaseInstanceId.i;
                countDownLatch.countDown();
                break;
        }
    }

    public /* synthetic */ gm1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
