package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
public final class om0 implements nm0 {
    public final SharedPreferences a;

    public om0(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    @Override // defpackage.nm0
    public final boolean a(String str, boolean z) {
        return this.a.getBoolean(str, z);
    }

    @Override // defpackage.nm0
    public final void b(String str, String str2) {
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.getClass();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    @Override // defpackage.nm0
    public final void c(r9e r9eVar) {
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.getClass();
        r9eVar.invoke(editorEdit);
        editorEdit.apply();
    }

    @Override // defpackage.nm0
    public final void d(int i, String str) {
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.getClass();
        editorEdit.putInt(str, i);
        editorEdit.apply();
    }

    @Override // defpackage.nm0
    public final String e(String str, String str2) {
        String string = this.a.getString(str, str2);
        return string == null ? str2 : string;
    }

    @Override // defpackage.nm0
    public final int f(String str) {
        return this.a.getInt(str, 0);
    }

    @Override // defpackage.nm0
    public final void g(long j, String str) {
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.getClass();
        editorEdit.putLong(str, j);
        editorEdit.apply();
    }

    @Override // defpackage.nm0
    public final SharedPreferences h() {
        return this.a;
    }

    @Override // defpackage.nm0
    public final void i(String str, boolean z) {
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.getClass();
        editorEdit.putBoolean(str, z);
        editorEdit.apply();
    }

    @Override // defpackage.nm0
    public final long j(String str) {
        return this.a.getLong(str, 0L);
    }

    @Override // defpackage.nm0
    public final String k(String str) {
        return this.a.getString(str, null);
    }

    @Override // defpackage.nm0
    public final Integer l(String str) {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences.contains(str)) {
            return Integer.valueOf(sharedPreferences.getInt(str, Integer.MIN_VALUE));
        }
        return null;
    }

    @Override // defpackage.nm0
    public final void remove(String str) {
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.getClass();
        editorEdit.remove(str);
        editorEdit.apply();
    }
}
