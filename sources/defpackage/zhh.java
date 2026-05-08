package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.pm.PackageManager;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class zhh extends j3i {
    public Boolean V;
    public long W;
    public long c;
    public String d;
    public Boolean e;
    public AccountManager f;

    @Override // defpackage.j3i
    public final boolean i() {
        Calendar calendar = Calendar.getInstance();
        this.c = ((long) (calendar.get(16) + calendar.get(15))) / 60000;
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.d = ja.g(uz.c(uz.c(1, lowerCase), lowerCase2), lowerCase, "-", lowerCase2);
        return false;
    }

    public final boolean j(Context context) {
        if (this.e == null) {
            awd awdVar = this.a.f;
            this.e = Boolean.FALSE;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    packageManager.getPackageInfo("com.google.android.gms", IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                    this.e = Boolean.TRUE;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return this.e.booleanValue();
    }

    public final long k() {
        g();
        return this.c;
    }

    public final String l() {
        g();
        return this.d;
    }

    public final long m() {
        b();
        return this.W;
    }

    public final boolean n() {
        Account[] result;
        b();
        i0i i0iVar = this.a;
        jh2 jh2Var = i0iVar.c0;
        Context context = i0iVar.a;
        jh2Var.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.W > 86400000) {
            this.V = null;
        }
        Boolean bool = this.V;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (ot2.a(context, "android.permission.GET_ACCOUNTS") != 0) {
            zzr().Y.b("Permission error checking for dasher/unicorn accounts");
            this.W = jCurrentTimeMillis;
            this.V = Boolean.FALSE;
            return false;
        }
        if (this.f == null) {
            this.f = AccountManager.get(context);
        }
        try {
            result = this.f.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
        } catch (AuthenticatorException e) {
            e = e;
            zzr().V.a(e, "Exception checking account types");
        } catch (OperationCanceledException e2) {
            e = e2;
            zzr().V.a(e, "Exception checking account types");
        } catch (IOException e3) {
            e = e3;
            zzr().V.a(e, "Exception checking account types");
        }
        if (result != null && result.length > 0) {
            this.V = Boolean.TRUE;
            this.W = jCurrentTimeMillis;
            return true;
        }
        Account[] result2 = this.f.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
        if (result2 != null && result2.length > 0) {
            this.V = Boolean.TRUE;
            this.W = jCurrentTimeMillis;
            return true;
        }
        this.W = jCurrentTimeMillis;
        this.V = Boolean.FALSE;
        return false;
    }
}
