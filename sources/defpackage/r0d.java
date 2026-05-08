package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002\u0010\u0011B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH¦@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lr0d;", "", "Key", "Value", "<init>", "()V", "Lzz8;", "loadType", "Ls2b;", "state", "Lr0d$b;", "load", "(Lzz8;Ls2b;Llu2;)Ljava/lang/Object;", "Lr0d$a;", "initialize", "(Llu2;)Ljava/lang/Object;", "a", "b", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class r0d<Key, Value> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final /* synthetic */ a[] b;

        static {
            a aVar = new a("LAUNCH_INITIAL_REFRESH", 0);
            a = aVar;
            b = new a[]{aVar, new a("SKIP_INITIAL_REFRESH", 1)};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) b.clone();
        }
    }

    public static abstract class b {

        public static final class a extends b {
            public final Exception a;

            public a(Exception exc) {
                this.a = exc;
            }
        }

        /* JADX INFO: renamed from: r0d$b$b, reason: collision with other inner class name */
        public static final class C0404b extends b {
            public final boolean a;

            public C0404b(boolean z) {
                this.a = z;
            }
        }
    }

    public static /* synthetic */ <Key, Value> Object initialize$suspendImpl(r0d<Key, Value> r0dVar, lu2<? super a> lu2Var) {
        return a.a;
    }

    public Object initialize(lu2<? super a> lu2Var) {
        return initialize$suspendImpl(this, lu2Var);
    }

    public abstract Object load(zz8 zz8Var, s2b<Key, Value> s2bVar, lu2<? super b> lu2Var);
}
