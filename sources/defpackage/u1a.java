package defpackage;

import defpackage.p2e;
import io.jsonwebtoken.JwtParser;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class u1a implements u3e {
    public final i3a a;
    public final List<vzd> b;
    public final int c;
    public final int d;
    public final boolean e;
    public final p2e f;

    public u1a(i3a i3aVar, List list, int i, int i2, boolean z, p2e p2eVar) {
        this.a = i3aVar;
        this.b = list;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = p2eVar;
        if (list.size() > 1) {
            return;
        }
        de7.c("MultiSelectionLayout requires an infoList size greater than 1, was " + list.size() + JwtParser.SEPARATOR_CHAR);
    }

    public static void n(k3a k3aVar, p2e p2eVar, vzd vzdVar, int i, int i2) {
        p2e p2eVar2;
        if (p2eVar.c) {
            p2eVar2 = new p2e(vzdVar.a(i2), vzdVar.a(i), i2 > i);
        } else {
            p2eVar2 = new p2e(vzdVar.a(i), vzdVar.a(i2), i > i2);
        }
        if (i > i2) {
            de7.c("minOffset should be less than or equal to maxOffset: " + p2eVar2);
        }
        long j = vzdVar.a;
        int iD = k3aVar.d(j);
        Object[] objArr = k3aVar.c;
        Object obj = objArr[iD];
        k3aVar.b[iD] = j;
        objArr[iD] = p2eVar2;
    }

    @Override // defpackage.u3e
    public final int a() {
        return this.b.size();
    }

    @Override // defpackage.u3e
    public final boolean b() {
        return this.e;
    }

    @Override // defpackage.u3e
    public final vzd c() {
        return this.e ? j() : i();
    }

    @Override // defpackage.u3e
    public final vzd d() {
        return f() == l73.a ? i() : j();
    }

    @Override // defpackage.u3e
    public final int e() {
        return this.d;
    }

    @Override // defpackage.u3e
    public final l73 f() {
        int i = this.c;
        int i2 = this.d;
        if (i < i2) {
            return l73.b;
        }
        if (i > i2) {
            return l73.a;
        }
        return this.b.get(i / 2).b();
    }

    @Override // defpackage.u3e
    public final void g(Function1<? super vzd, j6g> function1) {
        int iO = o(d().a);
        int iO2 = o((f() == l73.a ? j() : i()).a);
        int i = iO + 1;
        if (i >= iO2) {
            return;
        }
        while (i < iO2) {
            function1.invoke(this.b.get(i));
            i++;
        }
    }

    @Override // defpackage.u3e
    public final p2e h() {
        return this.f;
    }

    @Override // defpackage.u3e
    public final vzd i() {
        return this.b.get(p(this.d, false));
    }

    @Override // defpackage.u3e
    public final vzd j() {
        return this.b.get(p(this.c, true));
    }

    @Override // defpackage.u3e
    public final int k() {
        return this.c;
    }

    @Override // defpackage.u3e
    public final boolean l(u3e u3eVar) {
        if (this.f != null && u3eVar != null && (u3eVar instanceof u1a)) {
            u1a u1aVar = (u1a) u3eVar;
            List<vzd> list = u1aVar.b;
            if (this.e == u1aVar.e && this.c == u1aVar.c && this.d == u1aVar.d) {
                List<vzd> list2 = this.b;
                if (list2.size() == list.size()) {
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        vzd vzdVar = list2.get(i);
                        vzd vzdVar2 = list.get(i);
                        if (vzdVar.a != vzdVar2.a || vzdVar.c != vzdVar2.c || vzdVar.d != vzdVar2.d) {
                            return true;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.u3e
    public final k3a m(p2e p2eVar) {
        p2e.a aVar = p2eVar.a;
        boolean z = p2eVar.c;
        long j = aVar.c;
        int i = aVar.b;
        p2e.a aVar2 = p2eVar.b;
        long j2 = aVar2.c;
        int i2 = aVar2.b;
        if (j != j2) {
            k3a k3aVar = j59.a;
            k3a k3aVar2 = new k3a();
            n(k3aVar2, p2eVar, d(), (z ? aVar2 : aVar).b, d().f.a.a.b.length());
            g(new pu(this, k3aVar2, p2eVar));
            if (!z) {
                aVar = aVar2;
            }
            n(k3aVar2, p2eVar, f() == l73.a ? j() : i(), 0, aVar.b);
            return k3aVar2;
        }
        if ((!z || i < i2) && (z || i > i2)) {
            de7.c("unexpectedly miss-crossed selection: " + p2eVar);
        }
        long j3 = aVar.c;
        k3a k3aVar3 = j59.a;
        k3a k3aVar4 = new k3a();
        k3aVar4.h(p2eVar, j3);
        return k3aVar4;
    }

    public final int o(long j) {
        try {
            return this.a.c(j);
        } catch (NoSuchElementException e) {
            ja.m(r6.c(j, "Invalid selectableId: "), e);
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int p(int i, boolean z) {
        int iOrdinal = f().ordinal();
        boolean z2 = z;
        if (iOrdinal == 0) {
            z2 = !z ? 1 : 0;
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                l.g();
                return 0;
            }
        }
        return (i - (!z2)) / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiSelectionLayout(isStartHandle=");
        sb.append(this.e);
        sb.append(", startPosition=");
        boolean z = true;
        sb.append((this.c + 1) / 2.0f);
        sb.append(", endPosition=");
        sb.append((this.d + 1) / 2.0f);
        sb.append(", crossed=");
        sb.append(f());
        sb.append(", infos=");
        StringBuilder sb2 = new StringBuilder("[\n\t");
        List<vzd> list = this.b;
        int size = list.size();
        int i = 0;
        while (i < size) {
            vzd vzdVar = list.get(i);
            if (z) {
                z = false;
            } else {
                sb2.append(",\n\t");
            }
            StringBuilder sb3 = new StringBuilder();
            i++;
            sb3.append(i);
            sb3.append(" -> ");
            sb3.append(vzdVar);
            sb2.append(sb3.toString());
        }
        sb2.append("\n]");
        sb.append(sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
