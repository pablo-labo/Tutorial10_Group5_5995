package defpackage;

import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.exception.ApolloNetworkException;
import com.apollographql.apollo.exception.JsonDataException;
import defpackage.mb8;
import defpackage.pua;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class xua {
    public static void a(pua puaVar, so1 so1Var) {
        lb3 lb3Var = lb3.g;
        lb3Var.getClass();
        so1Var.j();
        so1Var.u0("operationName");
        so1Var.T0(puaVar.name());
        so1Var.u0("variables");
        so1Var.j();
        puaVar.d(so1Var, lb3Var, false);
        so1Var.t();
        so1Var.u0("query");
        so1Var.T0(puaVar.b());
        so1Var.t();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    public static sh0 b(pua puaVar, uo1 uo1Var) {
        ?? r3;
        lb3 lb3Var = lb3.g;
        lb3Var.getClass();
        sh0 th = null;
        try {
            sh0 sh0VarA = p6d.a(uo1Var, puaVar, null, lb3Var, null);
            try {
                uo1Var.close();
            } catch (Throwable th2) {
                th = th2;
            }
            sh0 sh0Var = th;
            th = sh0VarA;
            r3 = sh0Var;
        } catch (Throwable th3) {
            try {
                uo1Var.close();
                r3 = th3;
            } catch (Throwable th4) {
                boa.h(th3, th4);
                r3 = th3;
            }
        }
        if (r3 == 0) {
            return th;
        }
        throw r3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    public static final <D extends pua.a> sh0<D> c(mb8 mb8Var, pua<D> puaVar, UUID uuid, lb3 lb3Var, Set<zr3> set) {
        sh0<D> sh0Var;
        ?? r12;
        puaVar.getClass();
        lb3Var.getClass();
        sh0<D> sh0Var2 = null;
        try {
            sh0Var = p6d.a(mb8Var, puaVar, uuid, lb3Var, set);
            if (mb8Var.peek() != mb8.a.Z) {
                throw new JsonDataException("Expected END_DOCUMENT but was " + mb8Var.peek(), null);
            }
        } catch (Throwable th) {
            if (uuid == null) {
                try {
                    uuid = UUID.randomUUID();
                    uuid.getClass();
                } catch (Throwable th2) {
                    Throwable th3 = th2;
                    try {
                        mb8Var.close();
                        r12 = th3;
                    } catch (Throwable th4) {
                        boa.h(th3, th4);
                        r12 = th3;
                    }
                }
            }
            sh0Var = new sh0<>(uuid, puaVar, null, null, th instanceof ApolloException ? th : new ApolloNetworkException(th, "Error while reading JSON response"), bs4.a, wr4.a, true);
        }
        try {
            mb8Var.close();
        } catch (Throwable th5) {
            sh0Var2 = th5;
        }
        r12 = sh0Var2;
        sh0Var2 = sh0Var;
        if (r12 == 0) {
            return sh0Var2;
        }
        throw r12;
    }
}
