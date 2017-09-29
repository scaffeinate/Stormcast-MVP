package io.stormcast.app.stormcast.data.forecast;


import io.stormcast.app.stormcast.common.models.ForecastModel;
import io.stormcast.app.stormcast.common.models.LocationModel;

/**
 * Created by sudharti on 8/22/17.
 */

public interface ForecastDataSource {

    void loadForecast(LocationModel locationModel, boolean isManualRefresh, LoadForecastCallback loadForecastCallback);

    interface LoadForecastCallback {
        void onForecastLoaded(ForecastModel forecastModel);

        void onDataNotAvailable(String errorMessage);
    }

    interface SaveForecastCallback {
        void onForecastSaved();

        void onLocationSaveFailed(String errorMessage);
    }
}
