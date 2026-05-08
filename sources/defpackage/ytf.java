package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ytf<K, V> extends ttf<K, V, V> {
    @Override // java.util.Iterator
    public final V next() {
        int i = this.c;
        this.c = i + 2;
        return (V) this.a[i + 1];
    }
}
