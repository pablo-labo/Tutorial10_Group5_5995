package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.ResultReceiver;
import androidx.activity.result.ActivityResult;
import com.android.billingclient.api.ProxyBillingActivityV2;
import defpackage.ax1;
import expo.modules.imagemanipulator.CropRect;
import expo.modules.imagemanipulator.ImageInvalidCropException;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class bx1 implements n37, he0, n8 {
    public final Object a;

    public bx1(float f, float f2) {
        this.a = new fi5(f, f2, 0.01f);
    }

    @Override // defpackage.n37
    public Bitmap a(Bitmap bitmap) throws ImageInvalidCropException {
        bitmap.getClass();
        CropRect cropRect = (CropRect) this.a;
        if (cropRect.getOriginX() > bitmap.getWidth() || cropRect.getOriginY() > bitmap.getHeight() || cropRect.getWidth() > bitmap.getWidth() || cropRect.getHeight() > bitmap.getHeight()) {
            throw new ImageInvalidCropException();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, (int) cropRect.getOriginX(), (int) cropRect.getOriginY(), (int) cropRect.getWidth(), (int) cropRect.getHeight());
        bitmapCreateBitmap.getClass();
        return bitmapCreateBitmap;
    }

    public void b(v5b v5bVar) {
        ((ax1.b) this.a).a().c(v5bVar);
    }

    @Override // defpackage.n8
    public void c(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.a;
        ActivityResult activityResult = (ActivityResult) obj;
        Intent intent = activityResult.b;
        int i = ooh.a(intent, "ProxyBillingActivityV2").a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.m0;
        if (resultReceiver != null) {
            resultReceiver.send(i, intent == null ? null : intent.getExtras());
        }
        int i2 = activityResult.a;
        if (i2 != -1 || i != 0) {
            ooh.d("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i2 + " and billing's responseCode: " + i);
        }
        proxyBillingActivityV2.finish();
    }

    public void d(float f, float f2, float f3, float f4, int i) {
        ((ax1.b) this.a).a().e(f, f2, f3, f4, i);
    }

    public void e(float f, float f2, float f3, float f4) {
        ax1.b bVar = (ax1.b) this.a;
        ww1 ww1VarA = bVar.a();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (bVar.d() >> 32)) - (f3 + f);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (bVar.d() & 4294967295L)) - (f4 + f2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) < 0.0f) {
            zd7.a("Width and height must be greater than or equal to zero");
        }
        bVar.h(jFloatToRawIntBits);
        ww1VarA.f(f, f2);
    }

    public void f(long j, float f) {
        ww1 ww1VarA = ((ax1.b) this.a).a();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        ww1VarA.f(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        ww1VarA.n(f);
        ww1VarA.f(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void g(long j, float f, float f2) {
        ww1 ww1VarA = ((ax1.b) this.a).a();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        ww1VarA.f(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        ww1VarA.a(f, f2);
        ww1VarA.f(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    @Override // defpackage.he0
    public zh5 get(int i) {
        return (fi5) this.a;
    }

    public void h(int i) {
        ((WebSettingsBoundaryInterface) this.a).setForceDark(i);
    }

    public void i() {
        ((WebSettingsBoundaryInterface) this.a).setForceDarkBehavior(2);
    }

    public void j() {
        ((WebSettingsBoundaryInterface) this.a).setWebauthnSupport(1);
    }

    public void k(float f, float f2) {
        ((ax1.b) this.a).a().f(f, f2);
    }

    public bx1(CropRect cropRect) {
        cropRect.getClass();
        this.a = cropRect;
    }

    public /* synthetic */ bx1(Object obj) {
        this.a = obj;
    }
}
