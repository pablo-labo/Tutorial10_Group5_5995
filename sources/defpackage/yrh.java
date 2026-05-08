package defpackage;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class yrh extends Fragment implements vv8 {
    public static final WeakHashMap b = new WeakHashMap();
    public final yoh a = new yoh();

    @Override // defpackage.vv8
    public final void c(String str, nv8 nv8Var) {
        this.a.a(str, nv8Var);
    }

    @Override // androidx.fragment.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.a.a.values().iterator();
        while (it.hasNext()) {
            ((nv8) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // defpackage.vv8
    public final nv8 h(Class cls, String str) {
        return (nv8) cls.cast(this.a.a.get(str));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator it = this.a.a.values().iterator();
        while (it.hasNext()) {
            ((nv8) it.next()).onActivityResult(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a.b(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        yoh yohVar = this.a;
        yohVar.b = 5;
        Iterator it = yohVar.a.values().iterator();
        while (it.hasNext()) {
            ((nv8) it.next()).onDestroy();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        yoh yohVar = this.a;
        yohVar.b = 3;
        Iterator it = yohVar.a.values().iterator();
        while (it.hasNext()) {
            ((nv8) it.next()).onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.a.c(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        yoh yohVar = this.a;
        yohVar.b = 2;
        Iterator it = yohVar.a.values().iterator();
        while (it.hasNext()) {
            ((nv8) it.next()).onStart();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        yoh yohVar = this.a;
        yohVar.b = 4;
        Iterator it = yohVar.a.values().iterator();
        while (it.hasNext()) {
            ((nv8) it.next()).onStop();
        }
    }
}
