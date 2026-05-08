package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.result.ActivityResult;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes3.dex */
public class v implements zgb, omg, n8, OnCanceledListener, OnFailureListener, OnSuccessListener, sxh {
    public final Object a;

    public v(float f, float f2, ge0 ge0Var) {
        he0 bx1Var;
        int[] iArr = mmg.a;
        if (ge0Var != null) {
            qq2 qq2Var = new qq2();
            int iB = ge0Var.b();
            fi5[] fi5VarArr = new fi5[iB];
            for (int i = 0; i < iB; i++) {
                fi5VarArr[i] = new fi5(f, f2, ge0Var.a(i));
            }
            qq2Var.a = fi5VarArr;
            bx1Var = qq2Var;
        } else {
            bx1Var = new bx1(f, f2);
        }
        this.a = new pmg(bx1Var);
    }

    @Override // defpackage.omg, defpackage.lmg
    public boolean a() {
        ((pmg) this.a).getClass();
        return false;
    }

    @Override // defpackage.sxh
    public void b(String str, int i, Throwable th, byte[] bArr, Map map) {
        ((fei) this.a).f(str, i, th, bArr, map);
    }

    @Override // defpackage.n8
    public void c(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.a;
        ActivityResult activityResult = (ActivityResult) obj;
        Intent intent = activityResult.b;
        int i = activityResult.a;
        Bundle extras = intent == null ? null : intent.getExtras();
        if (i != -1) {
            if (extras == null) {
                extras = new Bundle();
            }
            ooh.d("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i);
            extras.putInt("INTERNAL_LOG_ERROR_REASON", s7i.ERROR_IN_ACTIVITY_RESULT.zza());
            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i);
        }
        int i2 = ooh.a(intent, "ProxyBillingActivityV2").a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.o0;
        if (resultReceiver != null) {
            resultReceiver.send(i2, extras);
        } else {
            ooh.d("ProxyBillingActivityV2", "External offer flow result receiver is null");
        }
        if (i2 != 0) {
            ooh.d("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i2);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // defpackage.lmg
    public long d(ge0 ge0Var, ge0 ge0Var2, ge0 ge0Var3) {
        return ((pmg) this.a).d(ge0Var, ge0Var2, ge0Var3);
    }

    @Override // defpackage.zgb
    public long e(ph7 ph7Var, long j, vl8 vl8Var, long j2) {
        int i;
        ph7Var.getClass();
        int i2 = ph7Var.c;
        int i3 = ph7Var.d;
        int i4 = ph7Var.a;
        vl8Var.getClass();
        int i5 = (int) (j2 >> 32);
        int iOrdinal = ((pnf) this.a).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    l.g();
                    return 0L;
                }
                i = (i2 - i4) - i5;
            }
            return (((long) i4) << 32) | (((long) i3) & 4294967295L);
        }
        i = ((i2 - i4) - i5) / 2;
        i4 += i;
        return (((long) i4) << 32) | (((long) i3) & 4294967295L);
    }

    public yc3 f() {
        return new yc3((ByteArrayOutputStream) this.a);
    }

    public void g(int i) throws IOException {
        ((ByteArrayOutputStream) this.a).write(i);
    }

    public void h(int i) throws IOException {
        if (i <= 127) {
            g((byte) i);
            return;
        }
        int i2 = i;
        int i3 = 1;
        while (true) {
            i2 >>>= 8;
            if (i2 == 0) {
                break;
            } else {
                i3++;
            }
        }
        g((byte) (i3 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
        for (int i4 = (i3 - 1) * 8; i4 >= 0; i4 -= 8) {
            g((byte) (i >> i4));
        }
    }

    @Override // defpackage.lmg
    public ge0 k(ge0 ge0Var, ge0 ge0Var2, ge0 ge0Var3) {
        return ((pmg) this.a).k(ge0Var, ge0Var2, ge0Var3);
    }

    public void l(q qVar) throws IOException {
        if (qVar != null) {
            qVar.a().c(this);
        } else {
            r40.h("null object detected");
        }
    }

    @Override // defpackage.lmg
    public ge0 o(long j, ge0 ge0Var, ge0 ge0Var2, ge0 ge0Var3) {
        return ((pmg) this.a).o(j, ge0Var, ge0Var2, ge0Var3);
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public void onCanceled() {
        ((CountDownLatch) this.a).countDown();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        ((CountDownLatch) this.a).countDown();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((CountDownLatch) this.a).countDown();
    }

    @Override // defpackage.lmg
    public ge0 q(long j, ge0 ge0Var, ge0 ge0Var2, ge0 ge0Var3) {
        return ((pmg) this.a).q(j, ge0Var, ge0Var2, ge0Var3);
    }

    public v() {
        this.a = new CountDownLatch(1);
    }

    public v(pnf pnfVar) {
        this.a = pnfVar;
    }

    public /* synthetic */ v(Object obj) {
        this.a = obj;
    }
}
