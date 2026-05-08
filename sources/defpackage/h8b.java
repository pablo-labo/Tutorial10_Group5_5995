package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public interface h8b {

    public class a implements q3c {
        public final /* synthetic */ p3c a;

        public a(p3c p3cVar) {
            this.a = p3cVar;
        }

        @Override // defpackage.q3c
        public final void a(Bundle bundle) {
            this.a.resolve(bundle);
        }
    }

    public class b implements q3c {
        public final /* synthetic */ p3c a;

        public b(p3c p3cVar) {
            this.a = p3cVar;
        }

        @Override // defpackage.q3c
        public final void a(Bundle bundle) {
            this.a.resolve(bundle);
        }
    }

    static void e(h8b h8bVar, p3c p3cVar, String... strArr) {
        a aVar = new a(p3cVar);
        if (h8bVar == null) {
            p3cVar.reject("E_NO_PERMISSIONS", "Permissions module is null. Are you sure all the installed Expo modules are properly linked?", null);
        } else {
            h8bVar.h(aVar, strArr);
        }
    }

    static void i(h8b h8bVar, p3c p3cVar, String... strArr) {
        b bVar = new b(p3cVar);
        if (h8bVar == null) {
            p3cVar.reject("E_NO_PERMISSIONS", "Permissions module is null. Are you sure all the installed Expo modules are properly linked?", null);
        } else {
            h8bVar.a(bVar, strArr);
        }
    }

    void a(b bVar, String... strArr);

    void b(j8b j8bVar, String... strArr);

    boolean c(String... strArr);

    void d(j8b j8bVar, String... strArr);

    void h(q3c q3cVar, String... strArr);
}
