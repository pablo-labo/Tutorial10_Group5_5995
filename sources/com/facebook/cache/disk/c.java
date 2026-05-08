package com.facebook.cache.disk;

import android.os.StatFs;
import android.os.SystemClock;
import com.facebook.cache.disk.DefaultDiskStorage;
import com.facebook.cache.disk.b;
import defpackage.ase;
import defpackage.cbe;
import defpackage.f1a;
import defpackage.fia;
import defpackage.g95;
import defpackage.gia;
import defpackage.h95;
import defpackage.ie7;
import defpackage.jh2;
import defpackage.nn2;
import defpackage.oo1;
import defpackage.ot1;
import defpackage.s55;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements h95 {
    public final long a;
    public final long b;
    public long c;
    public final HashSet d;
    public long e;
    public final ase f;
    public final com.facebook.cache.disk.b g;
    public final ie7 h;
    public final fia i;
    public final a j;
    public final nn2 k;
    public final Object l = new Object();

    public static class a {
        public boolean a;
        public long b;
        public long c;

        public final synchronized long a() {
            return this.b;
        }

        public final synchronized void b(long j, long j2) {
            if (this.a) {
                this.b += j;
                this.c += j2;
            }
        }
    }

    public static class b {
        public final long a;
        public final long b;

        public b(long j, long j2, long j3) {
            this.a = j2;
            this.b = j3;
        }
    }

    public c(com.facebook.cache.disk.b bVar, ie7 ie7Var, b bVar2, gia giaVar, fia fiaVar, ExecutorService executorService) {
        ase aseVar;
        this.a = bVar2.a;
        long j = bVar2.b;
        this.b = j;
        this.c = j;
        synchronized (ase.class) {
            try {
                if (ase.h == null) {
                    ase.h = new ase();
                }
                aseVar = ase.h;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f = aseVar;
        this.g = bVar;
        this.h = ie7Var;
        this.e = -1L;
        this.i = fiaVar;
        a aVar = new a();
        aVar.a = false;
        aVar.b = -1L;
        aVar.c = -1L;
        this.j = aVar;
        this.k = nn2.e;
        this.d = new HashSet();
        new CountDownLatch(0);
    }

    @Override // defpackage.h95
    public final void a() {
        synchronized (this.l) {
            try {
                this.g.a();
                this.d.clear();
            } catch (IOException | NullPointerException e) {
                fia fiaVar = this.i;
                e.getMessage();
                fiaVar.getClass();
            }
            a aVar = this.j;
            synchronized (aVar) {
                aVar.a = false;
                aVar.c = -1L;
                aVar.b = -1L;
            }
        }
    }

    @Override // defpackage.h95
    public final boolean b(ot1 ot1Var) {
        synchronized (this.l) {
            if (f(ot1Var)) {
                return true;
            }
            try {
                ArrayList arrayListU = jh2.u(ot1Var);
                for (int i = 0; i < arrayListU.size(); i++) {
                    String str = (String) arrayListU.get(i);
                    if (this.g.c(str, ot1Var)) {
                        this.d.add(str);
                        return true;
                    }
                }
                return false;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    @Override // defpackage.h95
    public final void c(ot1 ot1Var) {
        synchronized (this.l) {
            try {
                ArrayList arrayListU = jh2.u(ot1Var);
                for (int i = 0; i < arrayListU.size(); i++) {
                    String str = (String) arrayListU.get(i);
                    this.g.remove(str);
                    this.d.remove(str);
                }
            } catch (IOException e) {
                fia fiaVar = this.i;
                e.getMessage();
                fiaVar.getClass();
            }
        }
    }

    @Override // defpackage.h95
    public final g95 d(ot1 ot1Var) {
        g95 g95VarF;
        cbe cbeVarB = cbe.b();
        cbeVarB.a = ot1Var;
        try {
            synchronized (this.l) {
                try {
                    ArrayList arrayListU = jh2.u(ot1Var);
                    String str = null;
                    g95VarF = null;
                    for (int i = 0; i < arrayListU.size() && (g95VarF = this.g.f(ot1Var, (str = (String) arrayListU.get(i)))) == null; i++) {
                    }
                    if (g95VarF == null) {
                        this.d.remove(str);
                    } else {
                        str.getClass();
                        this.d.add(str);
                    }
                } finally {
                }
            }
            return g95VarF;
        } catch (IOException unused) {
            this.i.getClass();
            return null;
        } finally {
            cbeVarB.c();
        }
    }

    @Override // defpackage.h95
    public final g95 e(ot1 ot1Var, oo1 oo1Var) {
        String strE;
        g95 g95VarA;
        cbe cbeVarB = cbe.b();
        cbeVarB.a = ot1Var;
        synchronized (this.l) {
            ot1Var.getClass();
            try {
                if (ot1Var instanceof f1a) {
                    Object obj = ((f1a) ot1Var).a.get(0);
                    obj.getClass();
                    strE = jh2.E((ot1) obj);
                } else {
                    strE = jh2.E(ot1Var);
                }
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            try {
                b.InterfaceC0126b interfaceC0126bJ = j(strE, ot1Var);
                try {
                    DefaultDiskStorage.d dVar = (DefaultDiskStorage.d) interfaceC0126bJ;
                    dVar.b(oo1Var);
                    synchronized (this.l) {
                        g95VarA = dVar.a();
                        this.d.add(strE);
                        this.j.b(g95VarA.a.length(), 1L);
                    }
                    g95VarA.a.length();
                    this.j.a();
                    File file = dVar.b;
                    if (!(!file.exists() || file.delete())) {
                        s55.d(c.class, "Failed to delete temp file");
                    }
                    return g95VarA;
                } catch (Throwable th) {
                    File file2 = ((DefaultDiskStorage.d) interfaceC0126bJ).b;
                    if (!(!file2.exists() || file2.delete())) {
                        s55.d(c.class, "Failed to delete temp file");
                    }
                    throw th;
                }
            } catch (IOException e2) {
                s55.e(c.class, "Failed inserting a file into the cache", e2);
                throw e2;
            }
        } finally {
            cbeVarB.c();
        }
    }

    @Override // defpackage.h95
    public final boolean f(ot1 ot1Var) {
        synchronized (this.l) {
            try {
                ArrayList arrayListU = jh2.u(ot1Var);
                for (int i = 0; i < arrayListU.size(); i++) {
                    if (this.d.contains((String) arrayListU.get(i))) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(long j) throws IOException {
        com.facebook.cache.disk.b bVar = this.g;
        try {
            ArrayList<b.a> arrayListH = h(bVar.g());
            a aVar = this.j;
            long jA = aVar.a() - j;
            int i = 0;
            long j2 = 0;
            for (b.a aVar2 : arrayListH) {
                if (j2 > jA) {
                    break;
                }
                long jE = bVar.e(aVar2);
                this.d.remove(aVar2.getId());
                if (jE > 0) {
                    i++;
                    j2 += jE;
                    cbe.b().c();
                }
            }
            aVar.b(-j2, -i);
            bVar.b();
        } catch (IOException e) {
            e.getMessage();
            this.i.getClass();
            throw e;
        }
    }

    public final ArrayList h(Collection collection) {
        this.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() + 7200000;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            b.a aVar = (b.a) it.next();
            if (aVar.b() > jCurrentTimeMillis) {
                arrayList.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
        }
        this.h.getClass();
        Collections.sort(arrayList2, new com.facebook.cache.disk.a());
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public final boolean i() {
        boolean z;
        long j;
        boolean z2;
        this.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        a aVar = this.j;
        synchronized (aVar) {
            z = aVar.a;
        }
        long jMax = -1;
        if (z) {
            long j2 = this.e;
            if (j2 != -1 && jCurrentTimeMillis - j2 <= 1800000) {
                return false;
            }
        }
        this.k.getClass();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j3 = 7200000 + jCurrentTimeMillis2;
        try {
            long jA = 0;
            boolean z3 = false;
            int i = 0;
            for (b.a aVar2 : this.g.g()) {
                i++;
                jA += aVar2.a();
                if (aVar2.b() > j3) {
                    aVar2.a();
                    jMax = Math.max(aVar2.b() - jCurrentTimeMillis2, jMax);
                    z3 = true;
                }
            }
            if (z3) {
                this.i.getClass();
            }
            a aVar3 = this.j;
            synchronized (aVar3) {
                j = aVar3.c;
            }
            long j4 = i;
            if (j == j4 && this.j.a() == jA) {
                z2 = true;
            } else {
                a aVar4 = this.j;
                synchronized (aVar4) {
                    aVar4.c = j4;
                    aVar4.b = jA;
                    z2 = true;
                    aVar4.a = true;
                }
            }
            this.e = jCurrentTimeMillis2;
            return z2;
        } catch (IOException e) {
            fia fiaVar = this.i;
            e.getMessage();
            fiaVar.getClass();
            return false;
        }
    }

    public final b.InterfaceC0126b j(String str, ot1 ot1Var) {
        synchronized (this.l) {
            boolean zI = i();
            k();
            long jA = this.j.a();
            if (jA > this.c && !zI) {
                a aVar = this.j;
                synchronized (aVar) {
                    aVar.a = false;
                    aVar.c = -1L;
                    aVar.b = -1L;
                }
                i();
            }
            long j = this.c;
            if (jA > j) {
                g((j * 9) / 10);
            }
        }
        return this.g.d(ot1Var, str);
    }

    public final void k() {
        ase.a aVar = ase.a.a;
        ase.a aVar2 = this.g.isExternal() ? ase.a.b : aVar;
        ase aseVar = this.f;
        long jA = this.b - this.j.a();
        aseVar.a();
        aseVar.a();
        ReentrantLock reentrantLock = aseVar.f;
        if (reentrantLock.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - aseVar.e > 120000) {
                    aseVar.a = ase.b(aseVar.a, aseVar.b);
                    aseVar.c = ase.b(aseVar.c, aseVar.d);
                    aseVar.e = SystemClock.uptimeMillis();
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        StatFs statFs = aVar2 == aVar ? aseVar.a : aseVar.c;
        long availableBlocksLong = statFs != null ? statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong() : 0L;
        if (availableBlocksLong <= 0 || availableBlocksLong < jA) {
            this.c = this.a;
        } else {
            this.c = this.b;
        }
    }
}
