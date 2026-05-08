package defpackage;

import java.io.Serializable;
import java.io.Writer;

/* JADX INFO: loaded from: classes3.dex */
public final class ave extends Writer implements Serializable {
    private static final long serialVersionUID = -146927496096066153L;
    private final StringBuilder builder = new StringBuilder();

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(char c) {
        this.builder.append(c);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    public final String toString() {
        return this.builder.toString();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        if (cArr != null) {
            this.builder.append(cArr, i, i2);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(char c) {
        this.builder.append(c);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        this.builder.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        this.builder.append(charSequence);
        return this;
    }

    @Override // java.io.Writer
    public final void write(String str) {
        if (str != null) {
            this.builder.append(str);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i, int i2) {
        this.builder.append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        this.builder.append(charSequence, i, i2);
        return this;
    }
}
