package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.agesignals.AgeSignalsException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class md2 implements u7h {
    public final Object a;

    public md2() {
        this.a = nf6.a(Looper.getMainLooper());
    }

    @Override // defpackage.y7h
    public Object a() {
        return this.a;
    }

    public void b(Object obj) {
        ((ArrayList) this.a).add(obj);
    }

    public void c(Object obj) {
        ArrayList arrayList = (ArrayList) this.a;
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public Task d(wab wabVar) {
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        o0i o0iVar = (o0i) this.a;
        qji qjiVar = o0iVar.b;
        if (qjiVar == null) {
            fsh fshVar = o0i.c;
            Object[] objArr = {-2};
            fshVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", fsh.c(fshVar.a, "onError(%d)", objArr));
            }
            return Tasks.forException(new AgeSignalsException(-2));
        }
        Context context = o0iVar.a;
        fsh fshVar2 = tki.a;
        try {
            packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 64);
            applicationInfo = packageInfo.applicationInfo;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        int i = (applicationInfo != null && applicationInfo.enabled && tki.a(packageInfo.signatures)) ? packageInfo.versionCode : 0;
        if (i >= 82380000) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            qjiVar.a().post(new a4i(qjiVar, taskCompletionSource, taskCompletionSource, new iuh(o0iVar, taskCompletionSource, taskCompletionSource, wabVar)));
            return taskCompletionSource.getTask();
        }
        fsh fshVar3 = o0i.c;
        Object[] objArr2 = {-6};
        fshVar3.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", fsh.c(fshVar3.a, "onError(%d)", objArr2));
        }
        return Tasks.forException(new AgeSignalsException(-6));
    }

    public md2(int i) {
        this.a = new ArrayList(i);
    }

    public /* synthetic */ md2(Object obj) {
        this.a = obj;
    }
}
