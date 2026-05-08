package defpackage;

import defpackage.c7e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import org.intellij.markdown.MarkdownParsingException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ltf {
    public final z a;

    public static final class a {
        public final y a;
        public final int b;
        public final int c;

        public a(y yVar, int i, int i2) {
            yVar.getClass();
            this.a = yVar;
            this.b = i;
            this.c = i2;
        }
    }

    public static final class b implements Comparable<b> {
        public final int a;
        public final int b;
        public final c7e.a c;

        public b(int i, int i2, c7e.a aVar) {
            this.a = i;
            this.b = i2;
            this.c = aVar;
        }

        public final boolean a() {
            return this.c.a.b != this.a;
        }

        @Override // java.lang.Comparable
        public final int compareTo(b bVar) {
            b bVar2 = bVar;
            bVar2.getClass();
            int i = bVar2.a;
            int i2 = this.a;
            if (i2 != i) {
                return i2 - i;
            }
            if (a() != bVar2.a()) {
                return a() ? 1 : -1;
            }
            oh7 oh7Var = this.c.a;
            int i3 = oh7Var.a;
            int i4 = oh7Var.b;
            oh7 oh7Var2 = bVar2.c.a;
            int i5 = oh7Var2.a;
            int i6 = oh7Var2.b;
            int i7 = (i3 + i4) - (i5 + i6);
            if (i7 != 0) {
                return (i3 == i4 || i5 == i6) ? i7 : -i7;
            }
            int i8 = this.b - bVar2.b;
            return a() ? -i8 : i8;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(a() ? "Open" : "Close");
            sb.append(": ");
            sb.append(this.a);
            sb.append(" (");
            sb.append(this.c);
            sb.append(')');
            return sb.toString();
        }
    }

    public ltf(z zVar) {
        this.a = zVar;
    }

    public final y a(List<c7e.a> list) {
        List<a> arrayList;
        list.getClass();
        ArrayList arrayList2 = new ArrayList();
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            c7e.a aVar = list.get(i2);
            oh7 oh7Var = aVar.a;
            int i3 = oh7Var.a;
            int i4 = oh7Var.b;
            arrayList2.add(new b(i3, i2, aVar));
            if (i4 != i3) {
                arrayList2.add(new b(i4, i2, aVar));
            }
        }
        w92.D0(arrayList2);
        mqe mqeVar = new mqe();
        if (arrayList2.isEmpty()) {
            throw new MarkdownParsingException("nonsense");
        }
        if (!((b) z92.O0(arrayList2)).c.equals(((b) z92.Y0(arrayList2)).c)) {
            StringBuilder sb = new StringBuilder("more than one root?\nfirst: ");
            sb.append(((b) z92.O0(arrayList2)).c);
            c7e.a aVar2 = ((b) z92.Y0(arrayList2)).c;
            sb.append("\nlast: ");
            sb.append(aVar2);
            throw new MarkdownParsingException(sb.toString());
        }
        int size2 = arrayList2.size();
        while (true) {
            if (i >= size2) {
                g7.l("markers stack should close some time thus would not be here!");
                return null;
            }
            b bVar = (b) arrayList2.get(i);
            ArrayList<E> arrayList3 = mqeVar.a;
            c(bVar, arrayList3.isEmpty() ? null : (List) ((Pair) z92.Y0(mqeVar)).e());
            boolean zA = bVar.a();
            c7e.a aVar3 = bVar.c;
            if (zA) {
                mqeVar.add(new Pair(bVar, new ArrayList()));
            } else {
                oh7 oh7Var2 = aVar3.a;
                if (oh7Var2.a == oh7Var2.b) {
                    arrayList = new ArrayList<>();
                } else {
                    Pair pair = (Pair) mqeVar.pop();
                    if (!((b) pair.d()).c.equals(aVar3)) {
                        throw new MarkdownParsingException("Intersecting parsed nodes detected: " + ((b) pair.d()).c + " vs " + aVar3);
                    }
                    arrayList = (List) pair.e();
                }
                boolean zIsEmpty = arrayList3.isEmpty();
                a aVarB = b(bVar, arrayList, zIsEmpty);
                if (zIsEmpty) {
                    if (i + 1 == arrayList2.size()) {
                        return aVarB.a;
                    }
                    throw new MarkdownParsingException("");
                }
                ((List) ((Pair) z92.Y0(mqeVar)).e()).add(aVarB);
            }
            i++;
        }
    }

    public abstract a b(b bVar, List<a> list, boolean z);

    public abstract void c(b bVar, List<a> list);
}
