package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import defpackage.p63;
import defpackage.x7d;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ld9d;", "Ll1g;", "<init>", "()V", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d9d extends l1g {
    public final frg a;
    public gu5<? extends w0g> b;

    public static final class a extends mj8 implements gu5<Fragment> {
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d9d d9dVar) {
            super(0);
            this.$this_viewModels = d9dVar;
        }

        @Override // defpackage.gu5
        public final Fragment invoke() {
            return this.$this_viewModels;
        }
    }

    public static final class b extends mj8 implements gu5<jrg> {
        final /* synthetic */ gu5 $ownerProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar) {
            super(0);
            this.$ownerProducer = aVar;
        }

        @Override // defpackage.gu5
        public final jrg invoke() {
            return (jrg) this.$ownerProducer.invoke();
        }
    }

    public static final class c extends mj8 implements gu5<irg> {
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return ((jrg) this.$owner$delegate.getValue()).getViewModelStore();
        }
    }

    public static final class d extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            if (gu5Var != null && (p63Var = (p63) gu5Var.invoke()) != null) {
                return p63Var;
            }
            jrg jrgVar = (jrg) this.$owner$delegate.getValue();
            hg6 hg6Var = jrgVar instanceof hg6 ? (hg6) jrgVar : null;
            return hg6Var != null ? hg6Var.getDefaultViewModelCreationExtras() : p63.a.b;
        }
    }

    public d9d() {
        nj njVar = new nj(this, 22);
        Lazy lazyE = boa.E(qt8.c, new b(new a(this)));
        this.a = os5.a(this, fwc.a.b(p9d.class), new c(lazyE), new d(lazyE), njVar);
    }

    public final p9d F() {
        return (p9d) this.a.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object cVar;
        String type;
        layoutInflater.getClass();
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("KEY_URI") : null;
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("KEY_FILE_NAME") : null;
        Bundle arguments3 = getArguments();
        Long lValueOf = arguments3 != null ? Long.valueOf(arguments3.getLong("KEY_FILE_DATE_ADDED")) : null;
        String extensionFromMimeType = (string == null || (type = requireContext().getContentResolver().getType(Uri.parse(string))) == null) ? null : MimeTypeMap.getSingleton().getExtensionFromMimeType(type);
        if (string == null || string2 == null) {
            cVar = null;
        } else {
            Uri uri = Uri.parse(string);
            Set<String> set = r9d.a;
            uri.getClass();
            cVar = wl7.b(extensionFromMimeType, "pdf") ? new x7d.c(uri, string2) : z92.I0(r9d.a, extensionFromMimeType) ? new x7d.a(uri, string2) : new x7d.b(uri, string2);
        }
        if (cVar != null) {
            p9d p9dVarF = F();
            if (cVar instanceof x7d.c) {
                x7d.c cVar2 = (x7d.c) cVar;
                p9dVarF.j(cVar2.a, cVar2.b);
            } else if (cVar instanceof x7d.a) {
                x7d.a aVar = (x7d.a) cVar;
                Uri uri2 = aVar.a;
                ((gme) p9dVarF.d).setValue(new n9d(uri2, aVar.b, uri2, 92));
            } else {
                if (!(cVar instanceof x7d.b)) {
                    l.g();
                    return null;
                }
                x7d.b bVar = (x7d.b) cVar;
                p9dVarF.h(bVar.a, bVar.b);
            }
        }
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6);
        composeView.setContent(new ah2(413027746, new uf(5, this, cVar, lValueOf), true));
        return composeView;
    }
}
