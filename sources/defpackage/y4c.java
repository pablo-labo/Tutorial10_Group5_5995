package defpackage;

import defpackage.a5c;
import defpackage.h3;
import defpackage.pi7;
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
public final class y4c extends rw5 implements tp9 {
    public static final y4c a;
    public static final a b = new a();
    private int bitField0_;
    private a5c conclusionOfConditionalEffect_;
    private List<a5c> effectConstructorArgument_;
    private c effectType_;
    private d kind_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final ur1 unknownFields;

    public static class a extends p3<y4c> {
        @Override // defpackage.n4b
        public final Object a(e92 e92Var, s45 s45Var) {
            return new y4c(e92Var, s45Var);
        }
    }

    public static final class b extends rw5.a<y4c, b> implements tp9 {
        public int b;
        public c c = c.RETURNS_CONSTANT;
        public List<a5c> d = Collections.EMPTY_LIST;
        public a5c e = a5c.a;
        public d f = d.AT_MOST_ONCE;

        @Override // rp9.a
        public final rp9 build() {
            y4c y4cVarL = l();
            if (y4cVarL.d()) {
                return y4cVarL;
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
            m((y4c) rw5Var);
            return this;
        }

        public final y4c l() {
            y4c y4cVar = new y4c(this);
            int i = this.b;
            int i2 = (i & 1) != 1 ? 0 : 1;
            y4cVar.effectType_ = this.c;
            if ((this.b & 2) == 2) {
                this.d = Collections.unmodifiableList(this.d);
                this.b &= -3;
            }
            y4cVar.effectConstructorArgument_ = this.d;
            if ((i & 4) == 4) {
                i2 |= 2;
            }
            y4cVar.conclusionOfConditionalEffect_ = this.e;
            if ((i & 8) == 8) {
                i2 |= 4;
            }
            y4cVar.kind_ = this.f;
            y4cVar.bitField0_ = i2;
            return y4cVar;
        }

        public final void m(y4c y4cVar) {
            a5c a5cVar;
            if (y4cVar == y4c.a) {
                return;
            }
            if (y4cVar.t()) {
                c cVarQ = y4cVar.q();
                cVarQ.getClass();
                this.b |= 1;
                this.c = cVarQ;
            }
            if (!y4cVar.effectConstructorArgument_.isEmpty()) {
                if (this.d.isEmpty()) {
                    this.d = y4cVar.effectConstructorArgument_;
                    this.b &= -3;
                } else {
                    if ((this.b & 2) != 2) {
                        this.d = new ArrayList(this.d);
                        this.b |= 2;
                    }
                    this.d.addAll(y4cVar.effectConstructorArgument_);
                }
            }
            if (y4cVar.s()) {
                a5c a5cVarP = y4cVar.p();
                if ((this.b & 4) != 4 || (a5cVar = this.e) == a5c.a) {
                    this.e = a5cVarP;
                } else {
                    a5c.b bVar = new a5c.b();
                    bVar.m(a5cVar);
                    bVar.m(a5cVarP);
                    this.e = bVar.l();
                }
                this.b |= 4;
            }
            if (y4cVar.u()) {
                d dVarR = y4cVar.r();
                dVarR.getClass();
                this.b |= 8;
                this.f = dVarR;
            }
            this.a = this.a.b(y4cVar.unknownFields);
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
                y4c$a r1 = defpackage.y4c.b     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r1.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                y4c r1 = new y4c     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r2.m(r1)
                return
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                rp9 r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                y4c r4 = (defpackage.y4c) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: y4c.b.n(e92, s45):void");
        }

        @Override // h3.a, rp9.a
        public final /* bridge */ /* synthetic */ rp9.a s0(e92 e92Var, s45 s45Var) throws Throwable {
            n(e92Var, s45Var);
            return this;
        }
    }

    public enum c implements pi7.a {
        RETURNS_CONSTANT(0),
        CALLS(1),
        RETURNS_NOT_NULL(2);

        private final int value;

        c(int i) {
            this.value = i;
        }

        @Override // pi7.a
        public final int getNumber() {
            return this.value;
        }
    }

    public enum d implements pi7.a {
        AT_MOST_ONCE(0),
        EXACTLY_ONCE(1),
        AT_LEAST_ONCE(2);

        private final int value;

        d(int i) {
            this.value = i;
        }

        @Override // pi7.a
        public final int getNumber() {
            return this.value;
        }
    }

    static {
        y4c y4cVar = new y4c();
        a = y4cVar;
        y4cVar.effectType_ = c.RETURNS_CONSTANT;
        y4cVar.effectConstructorArgument_ = Collections.EMPTY_LIST;
        y4cVar.conclusionOfConditionalEffect_ = a5c.a;
        y4cVar.kind_ = d.AT_MOST_ONCE;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public y4c(e92 e92Var, s45 s45Var) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        c cVar = c.RETURNS_CONSTANT;
        this.effectType_ = cVar;
        this.effectConstructorArgument_ = Collections.EMPTY_LIST;
        this.conclusionOfConditionalEffect_ = a5c.a;
        d dVar = d.AT_MOST_ONCE;
        this.kind_ = dVar;
        ur1.b bVar = new ur1.b();
        f92 f92VarJ = f92.j(bVar, 1);
        boolean z = false;
        char c2 = 0;
        while (!z) {
            try {
                try {
                    int iN = e92Var.n();
                    if (iN != 0) {
                        d dVar2 = null;
                        c cVar2 = null;
                        a5c.b bVar2 = null;
                        if (iN == 8) {
                            int iK = e92Var.k();
                            if (iK == 0) {
                                cVar2 = cVar;
                            } else if (iK == 1) {
                                cVar2 = c.CALLS;
                            } else if (iK == 2) {
                                cVar2 = c.RETURNS_NOT_NULL;
                            }
                            if (cVar2 == null) {
                                f92VarJ.v(iN);
                                f92VarJ.v(iK);
                            } else {
                                this.bitField0_ |= 1;
                                this.effectType_ = cVar2;
                            }
                        } else if (iN == 18) {
                            int i = (c2 == true ? 1 : 0) & 2;
                            c2 = c2;
                            if (i != 2) {
                                this.effectConstructorArgument_ = new ArrayList();
                                c2 = 2;
                            }
                            this.effectConstructorArgument_.add((a5c) e92Var.g(a5c.b, s45Var));
                        } else if (iN == 26) {
                            if ((this.bitField0_ & 2) == 2) {
                                a5c a5cVar = this.conclusionOfConditionalEffect_;
                                a5cVar.getClass();
                                bVar2 = new a5c.b();
                                bVar2.m(a5cVar);
                            }
                            a5c a5cVar2 = (a5c) e92Var.g(a5c.b, s45Var);
                            this.conclusionOfConditionalEffect_ = a5cVar2;
                            if (bVar2 != null) {
                                bVar2.m(a5cVar2);
                                this.conclusionOfConditionalEffect_ = bVar2.l();
                            }
                            this.bitField0_ |= 2;
                        } else if (iN == 32) {
                            int iK2 = e92Var.k();
                            if (iK2 == 0) {
                                dVar2 = dVar;
                            } else if (iK2 == 1) {
                                dVar2 = d.EXACTLY_ONCE;
                            } else if (iK2 == 2) {
                                dVar2 = d.AT_LEAST_ONCE;
                            }
                            if (dVar2 == null) {
                                f92VarJ.v(iN);
                                f92VarJ.v(iK2);
                            } else {
                                this.bitField0_ |= 4;
                                this.kind_ = dVar2;
                            }
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
                if (((c2 == true ? 1 : 0) & 2) == 2) {
                    this.effectConstructorArgument_ = Collections.unmodifiableList(this.effectConstructorArgument_);
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
        if (((c2 == true ? 1 : 0) & 2) == 2) {
            this.effectConstructorArgument_ = Collections.unmodifiableList(this.effectConstructorArgument_);
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
        for (int i = 0; i < this.effectConstructorArgument_.size(); i++) {
            if (!this.effectConstructorArgument_.get(i).d()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (!s() || this.conclusionOfConditionalEffect_.d()) {
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
        int iA = (this.bitField0_ & 1) == 1 ? f92.a(1, this.effectType_.getNumber()) : 0;
        for (int i2 = 0; i2 < this.effectConstructorArgument_.size(); i2++) {
            iA += f92.d(2, this.effectConstructorArgument_.get(i2));
        }
        if ((this.bitField0_ & 2) == 2) {
            iA += f92.d(3, this.conclusionOfConditionalEffect_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iA += f92.a(4, this.kind_.getNumber());
        }
        int size = this.unknownFields.size() + iA;
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
        if ((this.bitField0_ & 1) == 1) {
            f92Var.l(1, this.effectType_.getNumber());
        }
        for (int i = 0; i < this.effectConstructorArgument_.size(); i++) {
            f92Var.o(2, this.effectConstructorArgument_.get(i));
        }
        if ((this.bitField0_ & 2) == 2) {
            f92Var.o(3, this.conclusionOfConditionalEffect_);
        }
        if ((this.bitField0_ & 4) == 4) {
            f92Var.l(4, this.kind_.getNumber());
        }
        f92Var.r(this.unknownFields);
    }

    public final a5c p() {
        return this.conclusionOfConditionalEffect_;
    }

    public final c q() {
        return this.effectType_;
    }

    public final d r() {
        return this.kind_;
    }

    public final boolean s() {
        return (this.bitField0_ & 2) == 2;
    }

    public final boolean t() {
        return (this.bitField0_ & 1) == 1;
    }

    public final boolean u() {
        return (this.bitField0_ & 4) == 4;
    }

    public y4c() {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ur1.a;
    }

    public y4c(b bVar) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.a;
    }
}
