package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class taf implements Iterable<Intent> {
    public final ArrayList<Intent> a = new ArrayList<>();
    public final Context b;

    public taf(Context context) {
        this.b = context;
    }

    public final void a(ComponentName componentName) {
        Context context = this.b;
        ArrayList<Intent> arrayList = this.a;
        int size = arrayList.size();
        try {
            for (Intent intentB = kca.b(context, componentName); intentB != null; intentB = kca.b(context, intentB.getComponent())) {
                arrayList.add(size, intentB);
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            b0.s(e);
        }
    }

    public final void b() {
        ArrayList<Intent> arrayList = this.a;
        if (arrayList.isEmpty()) {
            r6.g("No intents added to TaskStackBuilder; cannot startActivities");
            return;
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        this.b.startActivities(intentArr, null);
    }

    @Override // java.lang.Iterable
    @Deprecated
    public final Iterator<Intent> iterator() {
        return this.a.iterator();
    }
}
