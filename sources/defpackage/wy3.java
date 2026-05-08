package defpackage;

import android.app.Service;
import androidx.work.impl.WorkDatabase;
import defpackage.o7d;
import io.jsonwebtoken.JwtParser;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.KotlinNullPointerException;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes.dex */
public final class wy3 implements jv1 {
    public final /* synthetic */ int a;
    public final Object b;

    public wy3() {
        this.a = 0;
        this.b = new one(xy3.a);
    }

    @Override // defpackage.jv1
    public void a(av1 av1Var, Throwable th) {
        ((qw1) this.b).resumeWith(new o7d.a(th));
    }

    @Override // defpackage.jv1
    public void b(av1 av1Var, m6d m6dVar) {
        qw1 qw1Var = (qw1) this.b;
        if (!m6dVar.a.h()) {
            qw1Var.resumeWith(new o7d.a(new HttpException(m6dVar)));
            return;
        }
        Object obj = m6dVar.b;
        if (obj != null) {
            qw1Var.resumeWith(obj);
            return;
        }
        Object objCast = ao7.class.cast(av1Var.a().e.get(ao7.class));
        if (objCast == null) {
            KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException();
            wl7.e(kotlinNullPointerException, wl7.class.getName());
            throw kotlinNullPointerException;
        }
        Method method = ((ao7) objCast).a;
        StringBuilder sb = new StringBuilder("Response from ");
        Class<?> declaringClass = method.getDeclaringClass();
        declaringClass.getClass();
        sb.append(declaringClass.getName());
        sb.append(JwtParser.SEPARATOR_CHAR);
        sb.append(method.getName());
        sb.append(" was null but response body type was declared as non-null");
        qw1Var.resumeWith(new o7d.a(new KotlinNullPointerException(sb.toString())));
    }

    public void c(pm8 pm8Var) {
        if (!pm8Var.d()) {
            ae7.b("DepthSortedSet.add called on an unattached node");
        }
        ((one) this.b).add(pm8Var);
    }

    public void d(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb.append((CharSequence) this.b);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e) {
            g7.l(e);
        }
    }

    public String e(List list) {
        Iterator it = list.iterator();
        StringBuilder sb = new StringBuilder();
        d(sb, it);
        return sb.toString();
    }

    public boolean f(pm8 pm8Var) {
        if (!pm8Var.d()) {
            ae7.b("DepthSortedSet.remove called on an unattached node");
        }
        return ((one) this.b).remove(pm8Var);
    }

    public ewh g() {
        ewh ewhVar = i0i.b((Service) this.b, null, null).X;
        i0i.i(ewhVar);
        return ewhVar;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return ((one) this.b).toString();
            default:
                return super.toString();
        }
    }

    public wy3(WorkDatabase workDatabase) {
        this.a = 1;
        workDatabase.getClass();
        this.b = workDatabase;
    }

    public /* synthetic */ wy3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public wy3(String str) {
        this.a = 2;
        str.getClass();
        this.b = str;
    }
}
