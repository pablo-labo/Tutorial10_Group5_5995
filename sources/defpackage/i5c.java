package defpackage;

import defpackage.h3;
import defpackage.rp9;
import defpackage.rw5;
import defpackage.ur1;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class i5c extends rw5 implements tp9 {
    public static final i5c a;
    public static final a b = new a();
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private nt8 string_;
    private final ur1 unknownFields;

    public static class a extends p3<i5c> {
        @Override // defpackage.n4b
        public final Object a(e92 e92Var, s45 s45Var) {
            return new i5c(e92Var);
        }
    }

    public static final class b extends rw5.a<i5c, b> implements tp9 {
        public int b;
        public nt8 c = mt8.b;

        @Override // rp9.a
        public final rp9 build() {
            i5c i5cVarL = l();
            if (i5cVarL.d()) {
                return i5cVarL;
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
            m((i5c) rw5Var);
            return this;
        }

        public final i5c l() {
            i5c i5cVar = new i5c(this);
            if ((this.b & 1) == 1) {
                this.c = this.c.v();
                this.b &= -2;
            }
            i5cVar.string_ = this.c;
            return i5cVar;
        }

        public final void m(i5c i5cVar) {
            if (i5cVar == i5c.a) {
                return;
            }
            if (!i5cVar.string_.isEmpty()) {
                if (this.c.isEmpty()) {
                    this.c = i5cVar.string_;
                    this.b &= -2;
                } else {
                    if ((this.b & 1) != 1) {
                        this.c = new mt8(this.c);
                        this.b |= 1;
                    }
                    this.c.addAll(i5cVar.string_);
                }
            }
            this.a = this.a.b(i5cVar.unknownFields);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void n(defpackage.e92 r2, defpackage.s45 r3) throws java.lang.Throwable {
            /*
                r1 = this;
                r3 = 0
                i5c$a r0 = defpackage.i5c.b     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r0.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                i5c r0 = new i5c     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r0.<init>(r2)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r1.m(r0)
                return
            Lf:
                r2 = move-exception
                goto L1b
            L11:
                r2 = move-exception
                rp9 r0 = r2.a()     // Catch: java.lang.Throwable -> Lf
                i5c r0 = (defpackage.i5c) r0     // Catch: java.lang.Throwable -> Lf
                throw r2     // Catch: java.lang.Throwable -> L19
            L19:
                r2 = move-exception
                r3 = r0
            L1b:
                if (r3 == 0) goto L20
                r1.m(r3)
            L20:
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: i5c.b.n(e92, s45):void");
        }

        @Override // h3.a, rp9.a
        public final /* bridge */ /* synthetic */ rp9.a s0(e92 e92Var, s45 s45Var) throws Throwable {
            n(e92Var, s45Var);
            return this;
        }
    }

    static {
        i5c i5cVar = new i5c();
        a = i5cVar;
        i5cVar.string_ = mt8.b;
    }

    public i5c(e92 e92Var) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.string_ = mt8.b;
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
                            oz8 oz8VarE = e92Var.e();
                            if (!z2) {
                                this.string_ = new mt8();
                                z2 = true;
                            }
                            this.string_.o0(oz8VarE);
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
                    this.string_ = this.string_.v();
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
            this.string_ = this.string_.v();
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
        int i2 = 0;
        int size = 0;
        while (true) {
            int size2 = this.string_.size();
            nt8 nt8Var = this.string_;
            if (i2 >= size2) {
                int size3 = this.unknownFields.size() + nt8Var.size() + size;
                this.memoizedSerializedSize = size3;
                return size3;
            }
            ur1 ur1VarK0 = nt8Var.k0(i2);
            size += ur1VarK0.size() + f92.f(ur1VarK0.size());
            i2++;
        }
    }

    @Override // defpackage.rp9
    public final rp9.a f() {
        return new b();
    }

    @Override // defpackage.rp9
    public final void h(f92 f92Var) {
        e();
        for (int i = 0; i < this.string_.size(); i++) {
            ur1 ur1VarK0 = this.string_.k0(i);
            f92Var.x(1, 2);
            f92Var.v(ur1VarK0.size());
            f92Var.r(ur1VarK0);
        }
        f92Var.r(this.unknownFields);
    }

    public final String l(int i) {
        return (String) this.string_.get(i);
    }

    public i5c() {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ur1.a;
    }

    public i5c(b bVar) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.a;
    }
}
