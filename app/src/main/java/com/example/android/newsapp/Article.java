package com.example.android.newsapp;

/**
 * An {@link Article} object contains information related to a single article.
 */

public class Article {
    /**
     * Title of the article
     */
    private String title;

    /**
     * Section of the article
     */
    private String section;


    /**
     * Date of the article
     */
    private String date;

    /**
     * Author of the article
     */
    private String author;

    /**
     * Website URL of the article
     */
    private String url;

    /**
     * Constructs a new {@link Article} object.
     *
     * @param title   is the title of the article
     * @param section is the section of the article
     * @param author  is the name of the name of the author of the article.
     * @param date    is the date when the article was published.
     * @param url     is the website URL to find more details about the article.
     */
    public Article(String title, String section, String author, String date, String url) {
        this.title = title;
        this.section = section;
        this.date = date;
        this.author = author;
        this.url = url;
    }

    /**
     * Returns the title of the article.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the section of the article.
     */
    public String getSection() {
        return section;
    }


    /**
     * Returns thedate  of the article.
     */
    public String getDate() {
        return date;
    }

    /**
     * Returns the name of the author of the article.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Returns the web URL of the article.
     */
    public String getUrl() {

        return url;
    }
}
