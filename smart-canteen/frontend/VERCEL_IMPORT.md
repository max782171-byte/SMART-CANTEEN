# Vercel import

This folder is the deployable frontend. Import it into Vercel with:

- Framework preset: `Vite`
- Build command: `npm run build`
- Output directory: `dist`
- Install command: `npm install`

The app includes a local demo fallback when the Spring Boot API is not deployed. Set `VITE_API_URL` in Vercel later if you deploy the backend separately.
