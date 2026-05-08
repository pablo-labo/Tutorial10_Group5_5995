package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.xh8;

/* JADX INFO: loaded from: classes2.dex */
public final class lq7 implements kq7, xh8 {
    @Override // defpackage.kq7
    public final void a(int i, String str, String str2) {
        SharedPreferences sharedPreferencesK = k(str);
        sharedPreferencesK.getClass();
        SharedPreferences.Editor editorEdit = sharedPreferencesK.edit();
        editorEdit.putInt(str2, i);
        editorEdit.apply();
    }

    @Override // defpackage.kq7
    public final String b(String str, String str2, String str3) {
        SharedPreferences sharedPreferencesK = k(str);
        return !sharedPreferencesK.contains(str2) ? str3 : sharedPreferencesK.getString(str2, str3);
    }

    @Override // defpackage.kq7
    public final Integer c(String str, Integer num, String str2) {
        SharedPreferences sharedPreferencesK = k(str);
        if (sharedPreferencesK.contains(str2)) {
            return Integer.valueOf(sharedPreferencesK.getInt(str2, num != null ? num.intValue() : Integer.MIN_VALUE));
        }
        return num;
    }

    @Override // defpackage.kq7
    public final void e(String str, String str2, boolean z) {
        SharedPreferences sharedPreferencesK = k(str);
        sharedPreferencesK.getClass();
        SharedPreferences.Editor editorEdit = sharedPreferencesK.edit();
        editorEdit.putBoolean(str2, z);
        editorEdit.apply();
    }

    @Override // defpackage.kq7
    public final void f(String str, String str2, String str3) {
        SharedPreferences sharedPreferencesK = k(str);
        sharedPreferencesK.getClass();
        SharedPreferences.Editor editorEdit = sharedPreferencesK.edit();
        editorEdit.putString(str2, str3);
        editorEdit.apply();
    }

    @Override // defpackage.kq7
    public final void g(String str) {
        SharedPreferences sharedPreferencesK = k(str);
        sharedPreferencesK.getClass();
        SharedPreferences.Editor editorEdit = sharedPreferencesK.edit();
        editorEdit.clear();
        editorEdit.apply();
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    @Override // defpackage.kq7
    public final Long h(Long l, String str, String str2) {
        SharedPreferences sharedPreferencesK = k(str);
        if (sharedPreferencesK.contains(str2)) {
            return Long.valueOf(sharedPreferencesK.getLong(str2, l != null ? l.longValue() : Long.MIN_VALUE));
        }
        return l;
    }

    @Override // defpackage.kq7
    public final void i(long j, String str, String str2) {
        SharedPreferences sharedPreferencesK = k(str);
        sharedPreferencesK.getClass();
        SharedPreferences.Editor editorEdit = sharedPreferencesK.edit();
        editorEdit.putLong(str2, j);
        editorEdit.apply();
    }

    @Override // defpackage.kq7
    public final boolean j(String str, String str2, boolean z) {
        return k(str).getBoolean(str2, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final SharedPreferences k(String str) {
        return ((Context) (this instanceof ai8 ? ((ai8) this).d() : (qpd) xh8.a.a().a.b).a(null, fwc.a.b(Context.class), null)).getSharedPreferences(str, 0);
    }
}
