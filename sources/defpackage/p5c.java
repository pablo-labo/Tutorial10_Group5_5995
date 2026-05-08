package defpackage;

import defpackage.h3;
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
public final class p5c extends rw5 implements tp9 {
    public static final p5c a;
    public static final a b = new a();
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private List<o5c> requirement_;
    private final ur1 unknownFields;

    public static class a extends p3<p5c> {
        @Override // defpackage.n4b
        public final Object a(e92 e92Var, s45 s45Var) {
            return new p5c(e92Var, s45Var);
        }
    }

    public static final class b extends rw5.a<p5c, b> implements tp9 {
        public int b;
        public List<o5c> c = Collections.EMPTY_LIST;

        @Override // rp9.a
        public final rp9 build() {
            p5c p5cVarL = l();
            if (p5cVarL.d()) {
                return p5cVarL;
            }
            throw new UninitializedMessageException();
        }

        @Override // rw5.a
        public final Object clone() {
            b bVar = new b();
            bVar.m(l());
            return bVar;
        }

        @Override // h3.a
        /* JADX INFO: renamed from: i */
        public final /* bridge */ /* synthetic */ h3.a s0(e92 e92Var, s45 s45Var) throws Throwable {
            n(e92Var, s45Var);
            return this;
        }

        @Override // rw5.a
        /* JADX INFO: renamed from: j */
        public final rw5.a clone() {
            b bVar = new b();
            bVar.m(l());
            return bVar;
        }

        @Override // rw5.a
        public final /* bridge */ /* synthetic */ rw5.a k(rw5 rw5Var) {
            m((p5c) rw5Var);
            return this;
        }

        public final p5c l() {
            p5c p5cVar = new p5c(this);
            if ((this.b & 1) == 1) {
                this.c = Collections.unmodifiableList(this.c);
                this.b &= -2;
            }
            p5cVar.requirement_ = this.c;
            return p5cVar;
        }

        public final void m(p5c p5cVar) {
            if (p5cVar == p5c.a) {
                return;
            }
            if (!p5cVar.requirement_.isEmpty()) {
                if (this.c.isEmpty()) {
                    this.c = p5cVar.requirement_;
                    this.b &= -2;
                } else {
                    if ((this.b & 1) != 1) {
                        this.c = new ArrayList(this.c);
                        this.b |= 1;
                    }
                    this.c.addAll(p5cVar.requirement_);
                }
            }
            this.a = this.a.b(p5cVar.unknownFields);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void n(defpackage.e92 r3, defpackage.s45 r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                p5c$a r1 = defpackage.p5c.b     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r1.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                p5c r1 = new p5c     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r2.m(r1)
                return
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                rp9 r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                p5c r4 = (defpackage.p5c) r4     // Catch: java.lang.Throwable -> Lf
                throw r3     // Catch: java.lang.Throwable -> L19
            L19:
                r3 = move-exception
                r0 = r4
            L1b:
                if (r0 == 0) goto L20
                r2.m(r0)
            L20:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p5c.b.n(e92, s45):void");
        }

        @Override // h3.a, rp9.a
        public final /* bridge */ /* synthetic */ rp9.a s0(e92 e92Var, s45 s45Var) throws Throwable {
            n(e92Var, s45Var);
            return this;
        }
    }

    static {
        p5c p5cVar = new p5c();
        a = p5cVar;
        p5cVar.requirement_ = Collections.EMPTY_LIST;
    }

    public p5c(e92 e92Var, s45 s45Var) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.requirement_ = Collections.EMPTY_LIST;
        ur1.b bVar = new ur1.b();
        f92 f92VarJ = f92.j(bVar, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int iN = e92Var.n();
                    if (iN != 0) {
                        if (iN == 10) {
                            if (!z2) {
                                this.requirement_ = new ArrayList();
                                z2 = true;
                            }
                            this.requirement_.add((o5c) e92Var.g(o5c.b, s45Var));
                        } else if (!e92Var.q(iN, f92VarJ)) {
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
                if (z2) {
                    this.requirement_ = Collections.unmodifiableList(this.requirement_);
                }
                try {
                    f92VarJ.k();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.unknownFields = bVar.p();
                    throw th2;
                }
                this.unknownFields = bVar.p();
                throw th;
            }
        }
        if (z2) {
            this.requirement_ = Collections.unmodifiableList(this.requirement_);
        }
        try {
            f92VarJ.k();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.unknownFields = bVar.p();
            throw th3;
        }
        this.unknownFields = bVar.p();
    }

    @Override // defpackage.rp9
    public final rp9.a c() {
        b bVar = new b();
        bVar.m(this);
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
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // defpackage.rp9
    public final int e() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iD = 0;
        for (int i2 = 0; i2 < this.requirement_.size(); i2++) {
            iD += f92.d(1, this.requirement_.get(i2));
        }
        int size = this.unknownFields.size() + iD;
        this.memoizedSerializedSize = size;
        return size;
    }

    @Override // defpackage.rp9
    public final rp9.a f() {
        return new b();
    }

    @Override // defpackage.rp9
    public final void h(f92 f92Var) {
        e();
        for (int i = 0; i < this.requirement_.size(); i++) {
            f92Var.o(1, this.requirement_.get(i));
        }
        f92Var.r(this.unknownFields);
    }

    public final int l() {
        return this.requirement_.size();
    }

    public final List<o5c> m() {
        return this.requirement_;
    }

    public final b n() {
        b bVar = new b();
        bVar.m(this);
        return bVar;
    }

    public p5c() {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ur1.a;
    }

    public p5c(b bVar) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.a;
    }
}
