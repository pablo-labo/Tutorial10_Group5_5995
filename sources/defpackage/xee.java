package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;
import defpackage.g91;
import defpackage.pa6;

/* JADX INFO: loaded from: classes2.dex */
public final class xee extends ja6<jbh> implements fbh {
    public final boolean B;
    public final w72 C;
    public final Bundle D;
    public final Integer E;

    public xee(Context context, Looper looper, w72 w72Var, Bundle bundle, pa6.a aVar, pa6.b bVar) {
        super(context, looper, 44, w72Var, aVar, bVar);
        this.B = true;
        this.C = w72Var;
        this.D = bundle;
        this.E = w72Var.h;
    }

    @Override // defpackage.fbh
    public final void a() {
        w0(new g91.d(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fbh
    public final void b(qah qahVar) {
        try {
            Account account = this.C.a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            GoogleSignInAccount googleSignInAccountB = "<<default account>>".equals(account.name) ? yte.a(this.c).b() : null;
            Integer num = this.E;
            fib.i(num);
            zat zatVar = new zat(2, account, num.intValue(), googleSignInAccountB);
            jbh jbhVar = (jbh) i();
            zai zaiVar = new zai(1, zatVar);
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(jbhVar.b);
            int i = hah.a;
            parcelObtain.writeInt(1);
            zaiVar.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(qahVar);
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                jbhVar.a.transact(12, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
            } finally {
                parcelObtain.recycle();
                parcelObtain2.recycle();
            }
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                qahVar.b.post(new pah(qahVar, new zak(1, new ConnectionResult(8, null, null), null)));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // defpackage.g91
    public final IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof jbh ? (jbh) iInterfaceQueryLocalInterface : new jbh(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // defpackage.g91
    public final Bundle g() {
        w72 w72Var = this.C;
        boolean zEquals = this.c.getPackageName().equals(w72Var.e);
        Bundle bundle = this.D;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", w72Var.e);
        }
        return bundle;
    }

    @Override // defpackage.g91
    public final String j() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // defpackage.g91
    public final String k() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // defpackage.g91, vf0.f
    public final boolean t0() {
        return this.B;
    }

    @Override // defpackage.g91, vf0.f
    public final int y0() {
        return 12451000;
    }
}
