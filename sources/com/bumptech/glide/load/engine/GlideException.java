package com.bumptech.glide.load.engine;

import android.util.Log;
import defpackage.kg8;
import defpackage.l5;
import defpackage.xe3;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GlideException extends Exception {
    public static final StackTraceElement[] a = new StackTraceElement[0];
    private static final long serialVersionUID = 1;
    private final List<Throwable> causes;
    private Class<?> dataClass;
    private xe3 dataSource;
    private String detailMessage;
    private Exception exception;
    private kg8 key;

    public GlideException(String str, List<Throwable> list) {
        this.detailMessage = str;
        setStackTrace(a);
        this.causes = list;
    }

    public static void a(Throwable th, ArrayList arrayList) {
        if (!(th instanceof GlideException)) {
            arrayList.add(th);
            return;
        }
        Iterator<Throwable> it = ((GlideException) th).causes.iterator();
        while (it.hasNext()) {
            a(it.next(), arrayList);
        }
    }

    public static void b(List list, a aVar) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            aVar.append("Cause (");
            int i2 = i + 1;
            aVar.append(String.valueOf(i2));
            aVar.append(" of ");
            aVar.append(String.valueOf(size));
            aVar.append("): ");
            Throwable th = (Throwable) list.get(i);
            if (th instanceof GlideException) {
                ((GlideException) th).e(aVar);
            } else {
                c(th, aVar);
            }
            i = i2;
        }
    }

    public static void c(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            l5.r(th);
        }
    }

    public final void d() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder("Root cause (");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i("Glide", sb.toString(), (Throwable) arrayList.get(i));
            i = i2;
        }
    }

    public final void e(Appendable appendable) {
        c(this, appendable);
        try {
            b(this.causes, new a(appendable));
        } catch (IOException e) {
            l5.r(e);
        }
    }

    public final void f(kg8 kg8Var, xe3 xe3Var, Class<?> cls) {
        this.key = kg8Var;
        this.dataSource = xe3Var;
        this.dataClass = cls;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    public final void g(RuntimeException runtimeException) {
        this.exception = runtimeException;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.detailMessage);
        sb.append(this.dataClass != null ? ", " + this.dataClass : "");
        sb.append(this.dataSource != null ? ", " + this.dataSource : "");
        sb.append(this.key != null ? ", " + this.key : "");
        ArrayList<Throwable> arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            sb.append(" root causes:");
        }
        for (Throwable th : arrayList) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        e(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        e(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        e(printWriter);
    }

    public GlideException(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    public static final class a implements Appendable {
        public final Appendable a;
        public boolean b = true;

        public a(Appendable appendable) {
            this.a = appendable;
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z = this.b;
            Appendable appendable = this.a;
            boolean z2 = false;
            if (z) {
                this.b = false;
                appendable.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i2 - 1) == '\n') {
                z2 = true;
            }
            this.b = z2;
            appendable.append(charSequence, i, i2);
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            append(charSequence, 0, charSequence.length());
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(char c) throws IOException {
            boolean z = this.b;
            Appendable appendable = this.a;
            if (z) {
                this.b = false;
                appendable.append("  ");
            }
            this.b = c == '\n';
            appendable.append(c);
            return this;
        }
    }
}
