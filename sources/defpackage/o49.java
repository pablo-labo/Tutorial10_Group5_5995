package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class o49 {
    public static final k V;
    public static final g W;
    public static final h X;
    public static final m Y;
    public static final d Z;
    public static final f a;
    public static final c a0;
    public static final a b;
    public static final b b0;
    public static final i c;
    public static final /* synthetic */ o49[] c0;
    public static final j d;
    public static final /* synthetic */ wv4 d0;
    public static final l e;
    public static final e f;

    public static final class a extends o49 {
        public a() {
            super("ALL", 0);
        }

        @Override // defpackage.o49
        public final int a() {
            return 8;
        }
    }

    public static final class b extends o49 {
        public b() {
            super("BLOCK", 11);
        }

        @Override // defpackage.o49
        public final int a() {
            return 9;
        }
    }

    public static final class c extends o49 {
        public c() {
            super("BLOCK_END", 10);
        }

        @Override // defpackage.o49
        public final int a() {
            return 10;
        }
    }

    public static final class d extends o49 {
        public d() {
            super("BLOCK_START", 9);
        }

        @Override // defpackage.o49
        public final int a() {
            return 11;
        }
    }

    public static final class e extends o49 {
        public e() {
            super("BOTTOM", 4);
        }

        @Override // defpackage.o49
        public final int a() {
            return 3;
        }
    }

    public static final class f {
        public static o49 a(int i) {
            switch (i) {
                case 0:
                    return o49.c;
                case 1:
                    return o49.e;
                case 2:
                    return o49.d;
                case 3:
                    return o49.f;
                case 4:
                    return o49.V;
                case 5:
                    return o49.W;
                case 6:
                    return o49.X;
                case 7:
                    return o49.Y;
                case 8:
                    return o49.b;
                case DatadogLogGenerator.CRASH /* 9 */:
                    return o49.b0;
                case 10:
                    return o49.a0;
                case 11:
                    return o49.Z;
                default:
                    l5.q(p6.c(i, "Unknown spacing type: "));
                    return null;
            }
        }
    }

    public static final class g extends o49 {
        public g() {
            super("END", 6);
        }

        @Override // defpackage.o49
        public final int a() {
            return 5;
        }
    }

    public static final class h extends o49 {
        public h() {
            super("HORIZONTAL", 7);
        }

        @Override // defpackage.o49
        public final int a() {
            return 6;
        }
    }

    public static final class i extends o49 {
        public i() {
            super("LEFT", 1);
        }

        @Override // defpackage.o49
        public final int a() {
            return 0;
        }
    }

    public static final class j extends o49 {
        public j() {
            super("RIGHT", 2);
        }

        @Override // defpackage.o49
        public final int a() {
            return 2;
        }
    }

    public static final class k extends o49 {
        public k() {
            super("START", 5);
        }

        @Override // defpackage.o49
        public final int a() {
            return 4;
        }
    }

    public static final class l extends o49 {
        public l() {
            super("TOP", 3);
        }

        @Override // defpackage.o49
        public final int a() {
            return 1;
        }
    }

    public static final class m extends o49 {
        public m() {
            super("VERTICAL", 8);
        }

        @Override // defpackage.o49
        public final int a() {
            return 7;
        }
    }

    static {
        a aVar = new a();
        b = aVar;
        i iVar = new i();
        c = iVar;
        j jVar = new j();
        d = jVar;
        l lVar = new l();
        e = lVar;
        e eVar = new e();
        f = eVar;
        k kVar = new k();
        V = kVar;
        g gVar = new g();
        W = gVar;
        h hVar = new h();
        X = hVar;
        m mVar = new m();
        Y = mVar;
        d dVar = new d();
        Z = dVar;
        c cVar = new c();
        a0 = cVar;
        b bVar = new b();
        b0 = bVar;
        o49[] o49VarArr = {aVar, iVar, jVar, lVar, eVar, kVar, gVar, hVar, mVar, dVar, cVar, bVar};
        c0 = o49VarArr;
        d0 = new wv4(o49VarArr);
        a = new f();
    }

    public o49() {
        throw null;
    }

    public static o49 valueOf(String str) {
        return (o49) Enum.valueOf(o49.class, str);
    }

    public static o49[] values() {
        return (o49[]) c0.clone();
    }

    public abstract int a();
}
