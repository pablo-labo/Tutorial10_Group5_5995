package defpackage;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.UninitializedMessageException;
import androidx.datastore.preferences.protobuf.e;
import androidx.datastore.preferences.protobuf.f;
import androidx.datastore.preferences.protobuf.i;
import androidx.datastore.preferences.protobuf.n;
import androidx.datastore.preferences.protobuf.u;
import androidx.datastore.preferences.protobuf.v;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class xjb extends n<xjb, a> implements up9 {
    private static final xjb DEFAULT_INSTANCE;
    private static volatile p4b<xjb> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private v<String, zjb> preferences_ = v.a;

    public static final class a extends n.a<xjb, a> implements up9 {
        public a() {
            super(xjb.DEFAULT_INSTANCE);
        }
    }

    public static final class b {
        public static final u<String, zjb> a = new u<>(r0h.a, r0h.c, zjb.w());
    }

    static {
        xjb xjbVar = new xjb();
        DEFAULT_INSTANCE = xjbVar;
        n.m(xjb.class, xjbVar);
    }

    public static v o(xjb xjbVar) {
        if (!xjbVar.preferences_.g()) {
            xjbVar.preferences_ = xjbVar.preferences_.i();
        }
        return xjbVar.preferences_;
    }

    public static a q() {
        return (a) ((n.a) DEFAULT_INSTANCE.i(n.f.e));
    }

    public static xjb r(FileInputStream fileInputStream) {
        xjb xjbVar = DEFAULT_INSTANCE;
        e.b bVar = new e.b(fileInputStream);
        i iVarA = i.a();
        n nVar = (n) xjbVar.i(n.f.d);
        try {
            a6c a6cVar = a6c.c;
            a6cVar.getClass();
            uod uodVarA = a6cVar.a(nVar.getClass());
            f fVar = bVar.d;
            if (fVar == null) {
                fVar = new f(bVar);
            }
            uodVarA.b(nVar, fVar, iVarA);
            uodVarA.c(nVar);
            if (nVar.l()) {
                return (xjb) nVar;
            }
            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
            invalidProtocolBufferException.f(nVar);
            throw invalidProtocolBufferException;
        } catch (IOException e) {
            if (e.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e.getCause());
            }
            InvalidProtocolBufferException invalidProtocolBufferException2 = new InvalidProtocolBufferException(e.getMessage());
            invalidProtocolBufferException2.f(nVar);
            throw invalidProtocolBufferException2;
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e2.getCause());
            }
            throw e2;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final Object i(n.f fVar) {
        p4b bVar;
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new zic(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.a});
            case 3:
                return new xjb();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                p4b<xjb> p4bVar = PARSER;
                if (p4bVar != null) {
                    return p4bVar;
                }
                synchronized (xjb.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new n.b();
                            PARSER = bVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return bVar;
            default:
                b0.l();
                return null;
        }
    }

    public final Map<String, zjb> p() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
