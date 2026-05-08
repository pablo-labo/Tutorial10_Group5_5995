package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class gha extends xp2<yga> {
    @Override // defpackage.xp2
    public final boolean b(r3h r3hVar) {
        r3hVar.getClass();
        dha dhaVar = r3hVar.j.a;
        if (dhaVar != dha.c) {
            return Build.VERSION.SDK_INT >= 30 && dhaVar == dha.f;
        }
        return true;
    }

    @Override // defpackage.xp2
    public final boolean c(yga ygaVar) {
        yga ygaVar2 = ygaVar;
        ygaVar2.getClass();
        return !ygaVar2.a || ygaVar2.c;
    }
}
