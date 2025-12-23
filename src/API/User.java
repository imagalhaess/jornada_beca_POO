package API;

public record User(
        String login,
        long id,
        String node_id,
        String avatar_url,
        String url,
        String html_url,
        String type,
        boolean site_admin,
        String name,
        String company,
        String blog,
        String location,
        String email,
        String bio,
        String twitter_username,
        int public_repos,
        int public_gists,
        int followers,
        int following,
        String created_at,
        String updated_at
) {
}