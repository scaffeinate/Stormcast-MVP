package io.stormcast.app.stormcast.home;

import java.util.List;

import io.stormcast.app.stormcast.common.Location;

/**
 * Created by sudhar on 8/15/17.
 */

public interface HomeContract {
	interface View {
		void onLocationsLoaded(List<Location> locations);
	}

	interface Presenter {
		void loadLocations();
	}
}
