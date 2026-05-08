package defpackage;

import android.util.Log;
import defpackage.uu2;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class qp5<I> extends y81<I> {
    public final ArrayList a = new ArrayList(2);

    @Override // defpackage.uu2
    public final void a(Object obj, String str) {
        str.getClass();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                try {
                    ((uu2) arrayList.get(i)).a(obj, str);
                    j6g j6gVar = j6g.a;
                } catch (Exception e) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onIntermediateImageSet", e);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // defpackage.uu2
    public final void b(String str) {
        str.getClass();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                try {
                    ((uu2) arrayList.get(i)).b(str);
                    j6g j6gVar = j6g.a;
                } catch (Exception e) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onIntermediateImageFailed", e);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // defpackage.uu2
    public final void c(String str, I i, uu2.a aVar) {
        str.getClass();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                try {
                    ((uu2) arrayList.get(i2)).c(str, i, aVar);
                    j6g j6gVar = j6g.a;
                } catch (Exception e) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onFinalImageSet", e);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // defpackage.uu2
    public final void d(String str, uu2.a aVar) {
        str.getClass();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                try {
                    ((uu2) arrayList.get(i)).d(str, aVar);
                    j6g j6gVar = j6g.a;
                } catch (Exception e) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onRelease", e);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // defpackage.uu2
    public final void e(String str, Throwable th, uu2.a aVar) {
        str.getClass();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                try {
                    ((uu2) arrayList.get(i)).e(str, th, aVar);
                    j6g j6gVar = j6g.a;
                } catch (Exception e) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onFailure", e);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // defpackage.uu2
    public final void f(String str, Object obj, uu2.a aVar) {
        str.getClass();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                try {
                    ((uu2) arrayList.get(i)).f(str, obj, aVar);
                    j6g j6gVar = j6g.a;
                } catch (Exception e) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onSubmit", e);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }
}
