package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes3.dex */
public final class f7f extends Fragment {
    public final b7f a;

    public f7f(b7f b7fVar) {
        b7fVar.getClass();
        this.a = b7fVar;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        b7f b7fVar = this.a;
        b7fVar.getClass();
        c7f c7fVar = b7fVar.b.get();
        if (c7fVar != null) {
            c7fVar.a(b7fVar, configuration);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return this.a;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        e7f eventEmitter$react_native_screens_release = this.a.getEventEmitter$react_native_screens_release();
        eventEmitter$react_native_screens_release.c.a(new tg6(dmc.g(eventEmitter$react_native_screens_release.a), eventEmitter$react_native_screens_release.b, 1));
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        e7f eventEmitter$react_native_screens_release = this.a.getEventEmitter$react_native_screens_release();
        eventEmitter$react_native_screens_release.c.a(new d7f(dmc.g(eventEmitter$react_native_screens_release.a), eventEmitter$react_native_screens_release.b));
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        e7f eventEmitter$react_native_screens_release = this.a.getEventEmitter$react_native_screens_release();
        eventEmitter$react_native_screens_release.c.a(new rg6(dmc.g(eventEmitter$react_native_screens_release.a), eventEmitter$react_native_screens_release.b, 1));
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        e7f eventEmitter$react_native_screens_release = this.a.getEventEmitter$react_native_screens_release();
        eventEmitter$react_native_screens_release.c.a(new gtd(dmc.g(eventEmitter$react_native_screens_release.a), eventEmitter$react_native_screens_release.b, 1));
        super.onStop();
    }
}
