package defpackage;

import android.view.View;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.indeed.android.jobsearch.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zte {
    public static awd a;

    public static final zv8 a(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            zv8 zv8Var = tag instanceof zv8 ? (zv8) tag : null;
            if (zv8Var != null) {
                return zv8Var;
            }
            Object objL = u63.L(view);
            view = objL instanceof View ? (View) objL : null;
        }
        return null;
    }

    public static final long b(mif mifVar, int i, boolean z, boolean z2) {
        q1a q1aVar = mifVar.b;
        long j = mifVar.c;
        int iD = q1aVar.d(i);
        q1a q1aVar2 = mifVar.b;
        if (iD >= q1aVar2.f) {
            return 9205357640488583168L;
        }
        boolean z3 = mifVar.a(((!z || z2) && (z || !z2)) ? Math.max(i + (-1), 0) : i) == mifVar.h(i);
        q1aVar2.l(i);
        int length = q1aVar2.a.a.b.length();
        ArrayList arrayList = q1aVar2.h;
        f3b f3bVar = (f3b) arrayList.get(i == length ? u63.J(arrayList) : ak2.m(i, arrayList));
        return (((long) Float.floatToRawIntBits(nic.B(f3bVar.a.e(f3bVar.d(i), z3), 0.0f, (int) (j >> 32)))) << 32) | (((long) Float.floatToRawIntBits(nic.B(q1aVar2.b(iD), 0.0f, (int) (j & 4294967295L)))) & 4294967295L);
    }

    public static final Object c(fla flaVar, qf8 qf8Var) {
        flaVar.getClass();
        qf8Var.getClass();
        return flaVar.invoke();
    }

    public static final int d(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final void e(View view, zv8 zv8Var) {
        view.getClass();
        view.setTag(R.id.view_tree_lifecycle_owner, zv8Var);
    }

    public static void f(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.s0()) {
            taskCompletionSource.setResult(obj);
        } else {
            taskCompletionSource.setException(hh2.q(status));
        }
    }

    public static final double g(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }

    public static final String h(int i, long j) {
        if (j >= 0) {
            ypd.s(i);
            String string = Long.toString(j, i);
            string.getClass();
            return string;
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        ypd.s(i);
        String string2 = Long.toString(j3, i);
        string2.getClass();
        ypd.s(i);
        String string3 = Long.toString(j4, i);
        string3.getClass();
        return string2.concat(string3);
    }

    public static String i(prh prhVar) {
        StringBuilder sb = new StringBuilder(prhVar.c());
        for (int i = 0; i < prhVar.c(); i++) {
            byte bA = prhVar.a(i);
            if (bA == 34) {
                sb.append("\\\"");
            } else if (bA == 39) {
                sb.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case DatadogLogGenerator.CRASH /* 9 */:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb.append('\\');
                            sb.append((char) (((bA >>> 6) & 3) + 48));
                            sb.append((char) (((bA >>> 3) & 7) + 48));
                            sb.append((char) ((bA & 7) + 48));
                        } else {
                            sb.append((char) bA);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
