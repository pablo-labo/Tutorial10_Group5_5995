package defpackage;

import android.os.Parcel;
import com.google.android.gms.recaptchabase.ExecuteRequest;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class ke0 implements ie0, yv5, tr0, n0d {
    public final Object a;

    public ke0() {
        this.a = Collections.synchronizedList(new ArrayList());
    }

    public static /* synthetic */ void D0(int i) {
        String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 1 ? 3 : 2];
        if (i != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i != 1) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i == 1) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // defpackage.tr0
    public Object K(xrd xrdVar, Float f, Float f2, Function1 function1, nle nleVar) {
        float fFloatValue = f.floatValue();
        float fFloatValue2 = f2.floatValue();
        Object objH = ewa.h(xrdVar, Math.signum(fFloatValue2) * Math.abs(fFloatValue), fFloatValue, boa.a(0.0f, fFloatValue2, 28), (vpe) this.a, function1, nleVar);
        return objH == g13.a ? objH : (vd0) objH;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.n0d
    public void accept(Object obj, Object obj2) {
        vf0 vf0Var = wfi.k;
        ExecuteRequest executeRequest = (ExecuteRequest) this.a;
        eai eaiVar = new eai((TaskCompletionSource) obj2);
        exh exhVar = (exh) ((ehi) obj).i();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
        int i = qoh.a;
        parcelObtain.writeStrongBinder(eaiVar);
        parcelObtain.writeInt(1);
        executeRequest.writeToParcel(parcelObtain, 0);
        exhVar.c(parcelObtain, 2);
    }

    @Override // defpackage.ie0
    public lf0 getAnnotations() {
        lf0 lf0Var = (lf0) this.a;
        if (lf0Var != null) {
            return lf0Var;
        }
        D0(1);
        throw null;
    }

    @Override // defpackage.yv5
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
    }

    @Override // defpackage.yv5
    public void t(Throwable th) {
        zkd.U("MediaNtfMng", "custom command " + ((String) this.a) + " produced an error: " + th.getMessage(), th);
    }

    public /* synthetic */ ke0(Object obj) {
        this.a = obj;
    }

    public ke0(lf0 lf0Var) {
        if (lf0Var != null) {
            this.a = lf0Var;
        } else {
            D0(0);
            throw null;
        }
    }
}
