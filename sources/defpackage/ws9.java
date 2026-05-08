package defpackage;

import android.content.SharedPreferences;
import com.lyft.kronos.internal.ntp.SntpClient;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes2.dex */
public final class ws9 implements rqe {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public ws9(rqe[] rqeVarArr) {
        this.a = 0;
        this.b = rqeVarArr;
        this.c = new ojh(20);
    }

    public void a(SntpClient.a aVar) {
        synchronized (this) {
            qq2 qq2Var = (qq2) this.b;
            ((SharedPreferences) qq2Var.a).edit().putLong("com.lyft.kronos.cached_current_time", aVar.a).apply();
            qq2 qq2Var2 = (qq2) this.b;
            ((SharedPreferences) qq2Var2.a).edit().putLong("com.lyft.kronos.cached_elapsed_time", aVar.b).apply();
            qq2 qq2Var3 = (qq2) this.b;
            ((SharedPreferences) qq2Var3.a).edit().putLong("com.lyft.kronos.cached_offset", aVar.c).apply();
            j6g j6gVar = j6g.a;
        }
    }

    @Override // defpackage.rqe
    public StackTraceElement[] d(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        rqe[] rqeVarArr = (rqe[]) this.b;
        StackTraceElement[] stackTraceElementArrD = stackTraceElementArr;
        for (int i = 0; i < 1; i++) {
            rqe rqeVar = rqeVarArr[i];
            if (stackTraceElementArrD.length <= 1024) {
                break;
            }
            stackTraceElementArrD = rqeVar.d(stackTraceElementArr);
        }
        return stackTraceElementArrD.length > 1024 ? ((ojh) this.c).d(stackTraceElementArrD) : stackTraceElementArrD;
    }

    public boolean equals(Object obj) {
        switch (this.a) {
            case 1:
                if (!(obj instanceof a3b)) {
                    return false;
                }
                a3b a3bVar = (a3b) obj;
                F f = a3bVar.a;
                Object obj2 = (String) this.b;
                if (f != obj2 && (f == 0 || !f.equals(obj2))) {
                    return false;
                }
                S s = a3bVar.b;
                Object obj3 = (String) this.c;
                return s == obj3 || (s != 0 && s.equals(obj3));
            default:
                return super.equals(obj);
        }
    }

    public int hashCode() {
        switch (this.a) {
            case 1:
                String str = (String) this.b;
                int iHashCode = str == null ? 0 : str.hashCode();
                String str2 = (String) this.c;
                return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("Pair{");
                sb.append(this.b);
                sb.append(" ");
                sb.append(this.c);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public ws9(ThreadPoolExecutor threadPoolExecutor) {
        this.a = 3;
        this.c = new ht0();
        this.b = threadPoolExecutor;
    }

    public ws9(qq2 qq2Var, ypd ypdVar) {
        this.a = 2;
        this.b = qq2Var;
        this.c = ypdVar;
    }
}
