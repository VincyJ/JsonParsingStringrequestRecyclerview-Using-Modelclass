package example.com.jsonparsingstringrequest_recyclerview_modelclass;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by compaq on 3/30/2018.
 */

public class MoviesResponse {

    @SerializedName("page")
    private int page;
    @SerializedName("results")
    private List<Data> results;
    @SerializedName("total_results")
    private int totalResults;
    @SerializedName("total_pages")
    private int totalPages;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List<Data> getResults() {
        return results;
    }

    public void setResults(List<Data> results) {
        this.results = results;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

}
