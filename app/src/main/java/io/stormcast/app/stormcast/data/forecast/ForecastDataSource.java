package io.stormcast.app.stormcast.data.forecast;

import io.stormcast.app.stormcast.common.models.Forecast;
import io.stormcast.app.stormcast.common.models.Location;

/**
 * Created by sudharti on 8/22/17.
 */

public interface ForecastDataSource {


    interface LoadForecastCallback {
        void onForecastLoaded(Forecast forecast);

        void onDataNotAvailable(String errorMessage);
    }

    void loadForecast(Location location, LoadForecastCallback loadForecastCallback);
}
