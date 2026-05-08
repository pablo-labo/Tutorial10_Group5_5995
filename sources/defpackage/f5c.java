package defpackage;

import com.datadog.android.rum.internal.debug.UiRumDebugListener;
import defpackage.e5c;
import defpackage.h3;
import defpackage.h5c;
import defpackage.i5c;
import defpackage.rp9;
import defpackage.rw5;
import defpackage.ur1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class f5c extends rw5.c<f5c> {
    public static final f5c a;
    public static final a b = new a();
    private int bitField0_;
    private List<u4c> class__;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private e5c package_;
    private h5c qualifiedNames_;
    private i5c strings_;
    private final ur1 unknownFields;

    public static class a extends p3<f5c> {
        @Override // defpackage.n4b
        public final Object a(e92 e92Var, s45 s45Var) {
            return new f5c(e92Var, s45Var);
        }
    }

    public static final class b extends rw5.b<f5c, b> {
        public int d;
        public i5c e = i5c.a;
        public h5c f = h5c.a;
        public e5c V = e5c.a;
        public List<u4c> W = Collections.EMPTY_LIST;

        @Override // rp9.a
        public final rp9 build() {
            f5c f5cVarM = m();
            if (f5cVarM.d()) {
                return f5cVarM;
            }
            throw new UninitializedMessageException();
        }

        @Override // rw5.a
        public final Object clone() {
            b bVar = new b();
            bVar.n(m());
            return bVar;
        }

        @Override // h3.a
        /* JADX INFO: renamed from: i */
        public final /* bridge */ /* synthetic */ h3.a s0(e92 e92Var, s45 s45Var) throws Throwable {
            o(e92Var, s45Var);
            return this;
        }

        @Override // rw5.a
        /* JADX INFO: renamed from: j */
        public final rw5.a clone() {
            b bVar = new b();
            bVar.n(m());
            return bVar;
        }

        @Override // rw5.a
        public final /* bridge */ /* synthetic */ rw5.a k(rw5 rw5Var) {
            n((f5c) rw5Var);
            return this;
        }

        public final f5c m() {
            f5c f5cVar = new f5c(this);
            int i = this.d;
            int i2 = (i & 1) != 1 ? 0 : 1;
            f5cVar.strings_ = this.e;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            f5cVar.qualifiedNames_ = this.f;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            f5cVar.package_ = this.V;
            if ((this.d & 8) == 8) {
                this.W = Collections.unmodifiableList(this.W);
                this.d &= -9;
            }
            f5cVar.class__ = this.W;
            f5cVar.bitField0_ = i2;
            return f5cVar;
        }

        public final void n(f5c f5cVar) {
            e5c e5cVar;
            h5c h5cVar;
            i5c i5cVar;
            if (f5cVar == f5c.a) {
                return;
            }
            if (f5cVar.F()) {
                i5c i5cVarC = f5cVar.C();
                if ((this.d & 1) != 1 || (i5cVar = this.e) == i5c.a) {
                    this.e = i5cVarC;
                } else {
                    i5c.b bVar = new i5c.b();
                    bVar.m(i5cVar);
                    bVar.m(i5cVarC);
                    this.e = bVar.l();
                }
                this.d |= 1;
            }
            if (f5cVar.E()) {
                h5c h5cVarB = f5cVar.B();
                if ((this.d & 2) != 2 || (h5cVar = this.f) == h5c.a) {
                    this.f = h5cVarB;
                } else {
                    h5c.b bVar2 = new h5c.b();
                    bVar2.m(h5cVar);
                    bVar2.m(h5cVarB);
                    this.f = bVar2.l();
                }
                this.d |= 2;
            }
            if (f5cVar.D()) {
                e5c e5cVarA = f5cVar.A();
                if ((this.d & 4) != 4 || (e5cVar = this.V) == e5c.a) {
                    this.V = e5cVarA;
                } else {
                    e5c.b bVar3 = new e5c.b();
                    bVar3.n(e5cVar);
                    bVar3.n(e5cVarA);
                    this.V = bVar3.m();
                }
                this.d |= 4;
            }
            if (!f5cVar.class__.isEmpty()) {
                if (this.W.isEmpty()) {
                    this.W = f5cVar.class__;
                    this.d &= -9;
                } else {
                    if ((this.d & 8) != 8) {
                        this.W = new ArrayList(this.W);
                        this.d |= 8;
                    }
                    this.W.addAll(f5cVar.class__);
                }
            }
            l(f5cVar);
            this.a = this.a.b(f5cVar.unknownFields);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void o(defpackage.e92 r3, defpackage.s45 r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                f5c$a r1 = defpackage.f5c.b     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r1.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                f5c r1 = new f5c     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r2.n(r1)
                return
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                rp9 r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                f5c r4 = (defpackage.f5c) r4     // Catch: java.lang.Throwable -> Lf
                throw r3     // Catch: java.lang.Throwable -> L19
            L19:
                r3 = move-exception
                r0 = r4
            L1b:
                if (r0 == 0) goto L20
                r2.n(r0)
            L20:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: f5c.b.o(e92, s45):void");
        }

        @Override // h3.a, rp9.a
        public final /* bridge */ /* synthetic */ rp9.a s0(e92 e92Var, s45 s45Var) throws Throwable {
            o(e92Var, s45Var);
            return this;
        }
    }

    static {
        f5c f5cVar = new f5c(0);
        a = f5cVar;
        f5cVar.strings_ = i5c.a;
        f5cVar.qualifiedNames_ = h5c.a;
        f5cVar.package_ = e5c.a;
        f5cVar.class__ = Collections.EMPTY_LIST;
    }

    public f5c() {
        throw null;
    }

    public f5c(e92 e92Var, s45 s45Var) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.strings_ = i5c.a;
        this.qualifiedNames_ = h5c.a;
        this.package_ = e5c.a;
        this.class__ = Collections.EMPTY_LIST;
        ur1.b bVar = new ur1.b();
        f92 f92VarJ = f92.j(bVar, 1);
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    int iN = e92Var.n();
                    if (iN != 0) {
                        e5c.b bVar2 = null;
                        i5c.b bVar3 = null;
                        h5c.b bVar4 = null;
                        if (iN == 10) {
                            if ((this.bitField0_ & 1) == 1) {
                                i5c i5cVar = this.strings_;
                                i5cVar.getClass();
                                bVar3 = new i5c.b();
                                bVar3.m(i5cVar);
                            }
                            i5c i5cVar2 = (i5c) e92Var.g(i5c.b, s45Var);
                            this.strings_ = i5cVar2;
                            if (bVar3 != null) {
                                bVar3.m(i5cVar2);
                                this.strings_ = bVar3.l();
                            }
                            this.bitField0_ |= 1;
                        } else if (iN == 18) {
                            if ((this.bitField0_ & 2) == 2) {
                                h5c h5cVar = this.qualifiedNames_;
                                h5cVar.getClass();
                                bVar4 = new h5c.b();
                                bVar4.m(h5cVar);
                            }
                            h5c h5cVar2 = (h5c) e92Var.g(h5c.b, s45Var);
                            this.qualifiedNames_ = h5cVar2;
                            if (bVar4 != null) {
                                bVar4.m(h5cVar2);
                                this.qualifiedNames_ = bVar4.l();
                            }
                            this.bitField0_ |= 2;
                        } else if (iN == 26) {
                            if ((this.bitField0_ & 4) == 4) {
                                e5c e5cVar = this.package_;
                                e5cVar.getClass();
                                bVar2 = new e5c.b();
                                bVar2.n(e5cVar);
                            }
                            e5c e5cVar2 = (e5c) e92Var.g(e5c.b, s45Var);
                            this.package_ = e5cVar2;
                            if (bVar2 != null) {
                                bVar2.n(e5cVar2);
                                this.package_ = bVar2.m();
                            }
                            this.bitField0_ |= 4;
                        } else if (iN == 34) {
                            int i = (c == true ? 1 : 0) & '\b';
                            c = c;
                            if (i != 8) {
                                this.class__ = new ArrayList();
                                c = '\b';
                            }
                            this.class__.add((u4c) e92Var.g(u4c.b, s45Var));
                        } else if (!q(e92Var, f92VarJ, s45Var, iN)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    e.b(this);
                    throw e;
                } catch (IOException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                    invalidProtocolBufferException.b(this);
                    throw invalidProtocolBufferException;
                }
            } catch (Throwable th) {
                if (((c == true ? 1 : 0) & '\b') == 8) {
                    this.class__ = Collections.unmodifiableList(this.class__);
                }
                try {
                    f92VarJ.k();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.unknownFields = bVar.p();
                    throw th2;
                }
                this.unknownFields = bVar.p();
                p();
                throw th;
            }
        }
        if (((c == true ? 1 : 0) & '\b') == 8) {
            this.class__ = Collections.unmodifiableList(this.class__);
        }
        try {
            f92VarJ.k();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.unknownFields = bVar.p();
            throw th3;
        }
        this.unknownFields = bVar.p();
        p();
    }

    public final e5c A() {
        return this.package_;
    }

    public final h5c B() {
        return this.qualifiedNames_;
    }

    public final i5c C() {
        return this.strings_;
    }

    public final boolean D() {
        return (this.bitField0_ & 4) == 4;
    }

    public final boolean E() {
        return (this.bitField0_ & 2) == 2;
    }

    public final boolean F() {
        return (this.bitField0_ & 1) == 1;
    }

    @Override // defpackage.rp9
    public final rp9.a c() {
        b bVar = new b();
        bVar.n(this);
        return bVar;
    }

    @Override // defpackage.tp9
    public final boolean d() {
        byte b2 = this.memoizedIsInitialized;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (E() && !this.qualifiedNames_.d()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (D() && !this.package_.d()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.class__.size(); i++) {
            if (!this.class__.get(i).d()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (j()) {
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }
        this.memoizedIsInitialized = (byte) 0;
        return false;
    }

    @Override // defpackage.rp9
    public final int e() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iD = (this.bitField0_ & 1) == 1 ? f92.d(1, this.strings_) : 0;
        if ((this.bitField0_ & 2) == 2) {
            iD += f92.d(2, this.qualifiedNames_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iD += f92.d(3, this.package_);
        }
        for (int i2 = 0; i2 < this.class__.size(); i2++) {
            iD += f92.d(4, this.class__.get(i2));
        }
        int size = this.unknownFields.size() + k() + iD;
        this.memoizedSerializedSize = size;
        return size;
    }

    @Override // defpackage.rp9
    public final rp9.a f() {
        return new b();
    }

    @Override // defpackage.tp9
    public final rp9 g() {
        return a;
    }

    @Override // defpackage.rp9
    public final void h(f92 f92Var) {
        e();
        rw5.c.a aVar = new rw5.c.a(this);
        if ((this.bitField0_ & 1) == 1) {
            f92Var.o(1, this.strings_);
        }
        if ((this.bitField0_ & 2) == 2) {
            f92Var.o(2, this.qualifiedNames_);
        }
        if ((this.bitField0_ & 4) == 4) {
            f92Var.o(3, this.package_);
        }
        for (int i = 0; i < this.class__.size(); i++) {
            f92Var.o(4, this.class__.get(i));
        }
        aVar.a(UiRumDebugListener.DEFAULT_ALPHA, f92Var);
        f92Var.r(this.unknownFields);
    }

    public final List<u4c> z() {
        return this.class__;
    }

    public f5c(b bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.a;
    }

    public f5c(int i) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ur1.a;
    }
}
